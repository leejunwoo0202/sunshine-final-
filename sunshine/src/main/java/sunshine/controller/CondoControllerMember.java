package sunshine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "condoMem")
public class CondoControllerMember {

@RequestMapping(value = "memList")
public String memList() {

	return "condo/memList";
}
}
