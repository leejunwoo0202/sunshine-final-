package sunshine.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.command.CondoCommand;
import sunshine.command.CondoReserCommand;
import sunshine.mapper.MemberMapper;
import sunshine.model.LoginInfo;
import sunshine.model.DTO.MemberDTO;
import sunshine.service.condo.RoomBookingService;
import sunshine.service.condo.RoomDetailService;
import sunshine.service.condo.RoomListService;
import sunshine.service.condo.RoomReserService;
import sunshine.service.member.MemberInfoService;

@Controller
@RequestMapping(value = "condoMem")
public class CondoControllerMember {

	@Autowired
	RoomListService roomListService;
	@Autowired
	RoomDetailService roomDetailService;
	@Autowired
	RoomBookingService roomBookingService;
	@Autowired
	RoomReserService roomReserService;
	
	
@RequestMapping(value = "memList")
	public String memList(@RequestParam(value="page", defaultValue = "1")Integer page, Model model)throws Exception {
	roomListService.getRoomList(page, model);
	return "condo/member/memList";
	}

@RequestMapping(value = "memRoomDetail/{roomNum}")
public String memRoomDetail(@PathVariable(value="roomNum")String roomNum, Model model, CondoCommand condoCommand, HttpSession session) throws Exception {
	model.addAttribute(condoCommand);
	roomDetailService.getRoomDetail(roomNum, model, session);
	return "condo/member/memRoomDetail";
}

@RequestMapping(value = "memBooking/{roomNum}")
public String memBooking(@PathVariable(value="roomNum")String roomNum ,HttpSession session, Model model) throws Exception {
	roomBookingService.roomBooking(roomNum, session, model);
	
	return "condo/member/memBooking";
}
@RequestMapping(value = "memReser", method = RequestMethod.POST)
public String memReser(Model model , HttpSession session , CondoReserCommand command) throws Exception{
	roomReserService.roomReser(model,session,command);
	return "condo/member/myReser";
}
}
