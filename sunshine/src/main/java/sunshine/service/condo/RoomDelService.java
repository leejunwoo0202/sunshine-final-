package sunshine.service.condo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.command.CondoCommand;
import sunshine.mapper.CondoMapper;
import sunshine.model.DTO.CondoDTO;
@Service
@Component
public class RoomDelService {
@Autowired
CondoMapper condoMapper;
@Autowired	
PasswordEncoder passwordEncoder;
	public String roomDel(CondoCommand condoCommand, Model model, HttpSession session) throws Exception {
		String location = "";
		String roomNum=condoCommand.getRoomNum();
		CondoDTO condoDTO = new CondoDTO();
		condoDTO = condoMapper.RoomList(condoDTO).get(0);
		
		//패스워드 확인
//		if(!passwordEncoder.matches(condoCommand.getRoomPw(), condoDTO.getRoomPw())) { //비밀번호 일치하지 않으면 디테일 페이지로 ㄱㄱ
//			System.out.println("비밀번호 틀림");
//	         model.addAttribute("PwErr", "비밀번호가 다릅니다.");
//			location = "redirect:/condo/roomDetail/"+roomNum;
		System.out.println("dto : "+condoDTO.getRoomPw());
		System.out.println("command : "+condoCommand.getRoomPw());
		if(!condoCommand.getRoomPw().equals(condoDTO.getRoomPw())) {
			System.out.println("비밀번호 틀림");
	         model.addAttribute("PwErr", "비밀번호가 다릅니다.");
			location = "redirect:/condo/roomDetail/"+roomNum;
		}else {
			//일치한다면
			//객실 삭제
			Integer i = null;
			i = condoMapper.roomDel(condoDTO);
			location="redirect:/condo/roomList";
		
		}
		return location;
		
	}
}
