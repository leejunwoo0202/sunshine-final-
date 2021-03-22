package sunshine.service.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.EmployeeMapper;
import sunshine.model.DTO.EmployeeDTO;

@Service
public class EmployeeListService {
	@Autowired 
	EmployeeMapper employeeMapper;
	public void execute(Model model) {
		List<EmployeeDTO> list = employeeMapper.employeeList();
		model.addAttribute("list", list);
	}
}
