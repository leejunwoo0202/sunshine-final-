package sunshine.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.command.EmployeeCommand;
import sunshine.mapper.EmployeeMapper;
import sunshine.model.DTO.EmployeeDTO;

@Component
@Service
public class EmployeeModifyOkService {
	@Autowired
	EmployeeMapper employeeMapper;
	public void execute(EmployeeCommand employeeCommand) {
	EmployeeDTO employeeDTO = new EmployeeDTO();
	employeeDTO.setEmNo(employeeCommand.getEmNo());
	employeeDTO.setEmPhone(employeeCommand.getEmPhone());
	employeeDTO.setEmEmail(employeeCommand.getEmEmail());
	employeeDTO.setEmAddr(employeeCommand.getEmAddr());
	employeeMapper.employeeModifyOk(employeeDTO);
	}
}
