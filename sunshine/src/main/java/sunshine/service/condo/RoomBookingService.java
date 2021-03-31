package sunshine.service.condo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.CondoMapper;
import sunshine.model.LoginInfo;
import sunshine.model.DTO.CondoDTO;

@Component
@Service
public class RoomBookingService {
	@Autowired
	CondoMapper condoMapper;

	public void roomBooking(String roomNum, HttpSession session, Model model) throws Exception {
		//객실
		CondoDTO cDto = new CondoDTO();
		cDto.setRoomNum(roomNum);
		cDto = condoMapper.RoomList(cDto).get(0);
		model.addAttribute("room", cDto);
		
		//회원정보
		LoginInfo loginInfo = (LoginInfo)session.getAttribute("loginInfo");
		model.addAttribute("user", loginInfo);
		
	}
	
	
}
