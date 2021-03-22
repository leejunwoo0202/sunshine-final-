package sunshine.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void execute(EmployeeCommand employeeCommand) throws Exception {
		//dto 만들자리
		EmployeeDTO employeeDTO = new EmployeeDTO();
		
		employeeDTO.setEmName(employeeCommand.getEmName());
		employeeDTO.setEmId(employeeCommand.getEmId());
		employeeDTO.setEmPw(employeeCommand.getEmPw());
		employeeDTO.setEmPhone(employeeCommand.getEmPhone());
		employeeDTO.setEmEmail(employeeCommand.getEmEmail());
		employeeDTO.setEmAddr(employeeCommand.getEmAddr());
		employeeMapper.employeeJoin(employeeDTO);
	}
}