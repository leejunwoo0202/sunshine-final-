package sunshine.controller.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.command.EmployeeCommand;
import sunshine.service.employee.EmployeeDeleteService;
import sunshine.service.employee.EmployeeDetailService;
import sunshine.service.employee.EmployeeJoinService;
import sunshine.service.employee.EmployeeListService;
import sunshine.service.employee.EmployeeModifyOkService;

@Controller
@RequestMapping(value="employee")
public class EmployeeController {
	
	@Autowired
	EmployeeJoinService employeeJoinService;
	@Autowired
	EmployeeListService employeeListService;
	@Autowired
	EmployeeDetailService employeeDetailService;
	@Autowired
	EmployeeModifyOkService employeeModifyOkService;
	@Autowired
	EmployeeDeleteService employeeDeleteService;
	
	@ModelAttribute
	public EmployeeCommand setEmployeeCommand() {
		return new EmployeeCommand();
	}
	
	@RequestMapping(value="employeeMain")
	public String employeeMain(){
		//값을 활용하는 곳이 service다. 쉽게말하면
		return "employee/index";
		}
	@RequestMapping(value="employeeJoin")
	public String employeeJoin(EmployeeCommand employeeCommand) {
		return "employee/employeeJoin";
	}
	@RequestMapping(value="employeeJoinOk")
	public String employeeJoinOk(EmployeeCommand employeeCommand) throws Exception {
		employeeJoinService.execute(employeeCommand);
		return "employee/employeeJoinOk";
		//받고자 하는 주소로 커맨드를 기입
	}
	@RequestMapping(value="employeeList")
	public String employeeList(Model model) {
	employeeListService.execute(model);
	return "employee/employeeList";
	}
	@RequestMapping(value="employeeDetail")
	public String employeeDetail(
			//쿼리스트링이 날아왔을때 RequestParam으로 받아준다
			@RequestParam(value = "emNo") String emNo, Model model) {
	employeeDetailService.execute(emNo, model);
	return "employee/employeeDetail";
	}
	@RequestMapping(value="employeeModify")
	public String employeeModify(
			@RequestParam(value="emNo") String emNo, Model model) {
	employeeDetailService.execute(emNo,model);
	return "employee/employeeModify";
	}
	@RequestMapping(value="employeeModifyOk", method=RequestMethod.POST)
	public String employeeModifyOk(
			EmployeeCommand employeeCommand) {
				employeeModifyOkService.execute(employeeCommand);
	return "redirect:/employee/employeeDetail?emNo="+employeeCommand.getEmNo();
	
	}
	@RequestMapping(value="employeeDelete")
	public String employeeDelete(
			@RequestParam(value="emNo") String emNo) {
			employeeDeleteService.execute(emNo);
	return "redirect:/employee/employeeList";
	}
}