package sunshine.controller.rserv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sunshine.service.rserv.RservListService;

	@Controller
	@RequestMapping(value = "rserv")
	public class RservController {
		
	@Autowired
	RservListService rservListService;
		
	@RequestMapping(value = "rservMain")
	public String rservMain() {
		return "rserv/rservMain";
	}
	@RequestMapping(value="rservRegist")
	public String rservRegist() {
		return "rserv/rservRegist";
	}
	@RequestMapping(value="rservDetail")
	public String reservDetail() {
		return "rserv/rservDetail";
	}
//	@RequestMapping(value="contentsPrice", method = RequestMethod.POST)
//	public String getP(@RequestParam(value="contentsName")String contentsName, @RequestParam(value = "divPeople") String divPeople, Model model) throws Exception {
//		contentsListService.execute(contentsName, divPeople, model);
//		return "rserv/Del";
	}

