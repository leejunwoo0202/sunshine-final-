package sunshine.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import lombok.val;
import sunshine.command.CondoCommand;
import sunshine.service.condo.CondoRegistService;
import sunshine.service.condo.RoomDelService;
import sunshine.service.condo.RoomDetailService;
import sunshine.service.condo.RoomListService;
import sunshine.service.condo.RoomModifyService;

@Controller
@RequestMapping(value = "condo")
public class CondoController {
	
	@Autowired
	CondoRegistService condoRegistService;
	@Autowired
	RoomListService roomListService;
	@Autowired
	RoomDetailService roomDetailService;
	@Autowired
	RoomModifyService roomModifyService;
	@Autowired
	RoomDelService roomDelService;
	
	@ModelAttribute
	CondoCommand condoCommand() {
	      return new CondoCommand();
	   }
	
	
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
		condoRegistService.execute(condoCommand, result, mtfRequest);
		return "redirect:/condo/roomList";
	}
	//객실리스트
	@RequestMapping(value = "roomList")
	public String roomList(@RequestParam(value="page", defaultValue = "1")Integer page, Model model) throws Exception {
		roomListService.getRoomList(page, model);
		return "condo/roomList";
	}
	
	@RequestMapping(value = "roomDetail/{roomNum}")
	public String roomDetail(@PathVariable(value="roomNum")String roomNum, Model model, CondoCommand condoCommand , HttpSession session) throws Exception {
		model.addAttribute(condoCommand);
		roomDetailService.getRoomDetail(roomNum, model, session);
		return "condo/roomDetail";
	}
	@RequestMapping(value = "roomModify", method = RequestMethod.POST)
	public String roomModify(@Validated CondoCommand condoCommand, BindingResult result, Model model, HttpSession session,  MultipartHttpServletRequest mtfRequest)throws Exception {
		String location = roomModifyService.roomModify(condoCommand, model, session, mtfRequest);
		return location;
//		return "redirect:/condo/roomList";
	}
	@RequestMapping(value = "roomDel", method = RequestMethod.POST )
	public String roomDel(CondoCommand condoCommand, Model model, HttpSession session) throws Exception {
		String location = roomDelService.roomDel(condoCommand, model, session);
		return location;
	}
	
	
}
