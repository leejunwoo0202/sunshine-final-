package sunshine.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.command.EmployeeCommand;
import sunshine.mapper.EmployeeMapper;
import sunshine.model.DTO.EmployeeDTO;

@Component
@Service
public class EmployeeJoinService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	public void execute(EmployeeCommand employeeCommand) throws Exception {
		//dto 만들자리
		EmployeeDTO employeeDTO = new EmployeeDTO();
		
		employeeDTO.setEmName(employeeCommand.getEmName());
		employeeDTO.setEmId(employeeCommand.getEmId());
		employeeDTO.setEmPhone(employeeCommand.getEmPhone());
		employeeDTO.setEmEmail(employeeCommand.getEmEmail());
		employeeDTO.setEmAddr(employeeCommand.getEmAddr());
		
		String pw = passwordEncoder.encode(employeeCommand.getEmPw());
		employeeDTO.setEmPw(pw);
		employeeMapper.employeeJoin(employeeDTO);
	}
}