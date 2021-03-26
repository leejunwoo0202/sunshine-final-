package sunshine.service.condo;

import java.io.File;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import sunshine.command.CondoCommand;
import sunshine.mapper.CondoMapper;
import sunshine.model.DTO.CondoDTO;

@Service
@Component
public class RoomModifyService {
	@Autowired
	CondoMapper condoMapper;
	@Autowired
	PasswordEncoder passwordEncoder;

	public String roomModify(CondoCommand condoCommand, Model model, HttpSession session, MultipartHttpServletRequest mtfRequest )throws Exception{
		CondoDTO condoDTO = new CondoDTO();
		String location="";
		System.out.println("dto : " + condoMapper.RoomList(condoDTO).get(0));
		System.out.println("command : " + condoCommand.getRoomNum());
		String roomNum = condoCommand.getRoomNum();
		condoDTO = condoMapper.RoomList(condoDTO).get(0);
		
		if(!condoCommand.getRoomPw().equals(condoDTO.getRoomPw())) { //비밀번호 일치하지 않으면 디테일 페이지로 ㄱㄱ
			
			System.out.println("비밀번호 틀림");
			location = "redirect:/condo/roomDetail/"+roomNum;
	         model.addAttribute("PwErr", "비밀번호가 다릅니다.");
			
		}else { //비밀번호 일치한다면			
	            condoDTO.setRoomType(condoCommand.getRoomType());
				condoDTO.setRoomPrice(condoCommand.getRoomPrice());
				condoDTO.setRoomDetail(condoCommand.getRoomDetail());
				
			  //파일
//	         String path = "/WEB-INF/view/condo/upload";
//	         String roomImage = "";
//	         List<MultipartFile> fileList = mtfRequest.getFiles("roomImg");
//	         MultipartFile mf = condoCommand.getRoomImage();
//	         String original = mf.getOriginalFilename();
//	         if (!original.equals("")) { //파일이 있다면
//	            String originalFileExtension = original.substring(original.lastIndexOf("."));
//	            String store = UUID.randomUUID().toString().replace("-", "") + originalFileExtension;
//	            roomImage = original + "`";
////	            String saveFile = path + System.currentTimeMillis() + original;
//	            String filePath = path + "/" + store;
//	           mf.transferTo(new File(filePath));
//	            
//	         } else {
//			roomImage = condoDTO.getRoomImage();
//	         }
//			condoDTO.setRoomImage(roomImage);


			
		
		condoDTO.setRoomNum(roomNum);
		System.out.println( roomNum );
		Integer i = null;
		 i = condoMapper.condoModify(condoDTO);
		 System.out.println(i+"개 수정");
		 location = "redirect:/condo/roomList"; //비밀번호 일치하면 리스트페이지
		}
		 return location;
	}

}
