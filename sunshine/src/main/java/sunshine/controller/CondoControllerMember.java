package sunshine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.command.CondoCommand;
import sunshine.service.condo.RoomDetailService;
import sunshine.service.condo.RoomListService;

@Controller
@RequestMapping(value = "condoMem")
public class CondoControllerMember {

	@Autowired
	RoomListService roomListService;
	@Autowired
	RoomDetailService roomDetailService;
	
@RequestMapping(value = "memList")
	public String memList(@RequestParam(value="page", defaultValue = "1")Integer page, Model model)throws Exception {
	roomListService.getRoomList(page, model);
	return "condo/member/memList";
	}

@RequestMapping(value = "memBooking")
	public String memBooking(@PathVariable(value="roomNum")String roomNum, Model model, CondoCommand condoCommand)throws Exception {
	roomDetailService.getRoomDetail(roomNum, model);
	return "condo/booking/bookForm";

}

}
