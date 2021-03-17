package sunshine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "condo")
public class CondoController {
	@RequestMapping(value = "condoMain")
	public String condoMain() {
		return "condo/index";
	}

	@RequestMapping(value = "condoForm")
	public String condoForm() {
		return "condo/condoForm";
	}
}
