package sunshine.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.mapper.EmployeeMapper;

@Component
@Service
public class EmployeeDeleteService {
	@Autowired
	EmployeeMapper employeeMapper;
	public void execute(String emNo) {
	employeeMapper.employeeDelete(emNo);	
	}
}
