package sunshine.service.condo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import sunshine.command.CondoCommand;
import sunshine.mapper.CondoMapper;
import sunshine.model.AuthInfo;
import sunshine.model.DTO.CondoDTO;

@Component
@Service
public class CondoRegistService {

	@Autowired
	CondoMapper CondoMapper;
	public void execute(CondoCommand condoCommand, 
			BindingResult result, MultipartHttpServletRequest mtfRequest) {
		HttpSession session = mtfRequest.getSession();
		AuthInfo authInfo = (AuthInfo) session.getAttribute("authInfo");
		CondoDTO condoDTO = new CondoDTO();
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
	      List<MultipartFile> fileList = mtfRequest.getFiles("roomImage");
	      if(condoCommand.getRoomImage() != null) {
	    	  for(MultipartFile mf : condoCommand.getRoomImage()) { 
	         String original = mf.getOriginalFilename();
	         String originalFileExtension = original.substring(original.lastIndexOf("."));
	         String store = UUID.randomUUID().toString().replace("-", "") 
	        		 +originalFileExtension;
	         	roomImage += original+"`"; 	
	            File file = new File(filePath + "/" + store);
	            try {
					mf.transferTo(file);
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
	         }
	      }
	      condoDTO.setRoomImage(roomImage);
	      CondoMapper.insertCondo(condoDTO);
	}	
}


