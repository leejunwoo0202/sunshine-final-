package sunshine.service.condo;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import sunshine.command.CondoCommand;
import sunshine.mapper.CondoMapper;
import sunshine.model.DTO.CondoDTO;

@Component
@Service
public class CondoRegistService {

	@Autowired
	CondoMapper CondoMapper;
	public Integer execute(CondoCommand condoCommand, BindingResult result, Model model, HttpSession session) {
		CondoDTO condoDTO = new CondoDTO();
		Integer cnt = null;
		condoDTO.setRoomNum(condoCommand.getRoomNum());
		condoDTO.setRoomType(condoCommand.getRoomType());
		condoDTO.setRoomPrice(condoCommand.getRoomPrice());
//		condoDTO.setRoomImage(condoCommand.getRoomImage());
		condoDTO.setRoomDetail(condoCommand.getRoomDetail());
		
		// 이미지 파일 저장
	      String path = "WEB-INF/view/condo/upload";
	      // "WEB-INF/view/condo/upload"까지의 절대 경로 
	      String filePath = session.getServletContext().getRealPath(path);
	      ///이미지 파일명을 저장하기 위한 변수
	      String roomImage = "";
	      String storeFileNames = "";
	      if(condoCommand.getRoomImage() != null) {
	         MultipartFile mf = condoCommand.getRoomImage();
	         String original = mf.getOriginalFilename();
	         if(!original.equals("")) {
	            String extenstion = original.substring(original.lastIndexOf("."));
	            String store = UUID.randomUUID().toString().replace("-", "") + extenstion;
	            roomImage = original + "`" + store;
	            File file = new File(filePath + "/" + store);
	            try {
					mf.transferTo(file);
				} catch (IllegalStateException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         } else {
	            model.addAttribute("noImg", "이미지를 첨부해주세요.");
	         }
	         condoDTO.setRoomImage(roomImage);
	      }

		cnt = CondoMapper.insertCondo(condoDTO);
		
		 if(cnt == null) {
	         // 인서트 안됨
	         model.addAttribute("Using_roomNum", "사용중인 객실번호 입니다.");
	      }
		 return cnt;
	}
}
	
