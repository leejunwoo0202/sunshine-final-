package sunshine.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.EmployeeMapper;
import sunshine.model.DTO.EmployeeDTO;

@Component
@Service
public class EmployeeDetailService {
	@Autowired
	EmployeeMapper employeeMapper;
	public void execute(String emNo, Model model) {
	EmployeeDTO dto = employeeMapper.employeeDetail(emNo);
	model.addAttribute("emNo", dto);
	}
}

