package sunshine.service.condo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.CondoMapper;
import sunshine.mapper.EmployeeMapper;
import sunshine.mapper.MemberMapper;
import sunshine.model.LoginInfo;
import sunshine.model.DTO.CondoDTO;
import sunshine.model.DTO.EmployeeDTO;
import sunshine.model.DTO.MemberDTO;

@Service
@Component
public class RoomDetailService {
	@Autowired
	CondoMapper condoMapper;
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	EmployeeMapper empMapper;
	
	public void getRoomDetail(String roomNum, Model model, HttpSession session) throws Exception{
		CondoDTO condoDTO = new CondoDTO();
		
		condoDTO.setRoomNum(roomNum);
		
		List<CondoDTO> list = condoMapper.RoomList(condoDTO);
		
		model.addAttribute("list", list);
		
		
		// 로그인한 사람
		LoginInfo loginInfo = (LoginInfo) session.getAttribute("loginInfo");
		model.addAttribute("user",loginInfo);
		
		
	}

}
