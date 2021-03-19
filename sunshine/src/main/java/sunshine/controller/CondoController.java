package sunshine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import sunshine.command.CondoCommand;
import sunshine.service.condo.CondoRegistService;
import sunshine.service.condo.RoomListService;

@Controller
@RequestMapping(value = "condo")
public class CondoController {
	
	@Autowired
	CondoRegistService condoRegistService;
	@Autowired
	RoomListService roomListService;
	
	@RequestMapping(value = "condoMain")
	public String condoMain() {
		return "condo/condoIndex";
	}

	@RequestMapping(value = "condoForm")
	public String condoForm() {
		return "condo/condoForm";
	}
	//객실등록 + 다중파일업로드
	@RequestMapping(value = "condoRegistCom", method = RequestMethod.POST)
	public String condoRegistCom(@Validated CondoCommand condoCommand, BindingResult result, 
			Model model, MultipartHttpServletRequest mtfRequest) throws Exception {
		if(result.hasErrors()) {
			return "redirect:/condo/condoForm";
		}
		condoRegistService.execute(condoCommand, result,mtfRequest);
		return "redirect:/condo/roomList";
	}
	//객실리스트
	@RequestMapping(value = "roomList")
	public String roomList( Model model) throws Exception {
		roomListService.getRoomList(model);
		return "condo/roomList";
	}
	
}
