package sunshine.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sunshine.command.CondoCommand;
import sunshine.service.condo.CondoRegistService;

@Controller
@RequestMapping(value = "condo")
public class CondoController {
	
	@Autowired
	CondoRegistService condoRegistService;
	
	@RequestMapping(value = "condoMain")
	public String condoMain() {
		return "condo/condoIndex";
	}

	@RequestMapping(value = "roomList")
	public String roomList() {
		return "condo/roomList";
	}
	
	@RequestMapping(value = "condoForm")
	public String condoForm() {
		return "condo/condoForm";
	}
	
	@RequestMapping(value = "condoRegistCom", method = RequestMethod.POST)
	public String condoRegistCom(@Validated CondoCommand condoCommand, BindingResult result, Model model, HttpSession session) {
		Integer cnt = condoRegistService.execute(condoCommand, result, model, session);
		if(result.hasErrors() || cnt == null) {
			return "redirect:/condo/condoForm";
		}
		return "redirect:/condo/roomList";
	}
	
}
