package sunshine.service.review;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sunshine.command.ReviewCommand;
import sunshine.mapper.ReviewMapper;
import sunshine.model.DTO.EmployeeDTO;
import sunshine.model.DTO.ReviewDTO;

@Service
public class ReviewUpdateService {

	@Autowired
	ReviewMapper reviewMapper;
	
	public void execute(ReviewCommand reviewCommand,
			HttpSession session) {
		ReviewDTO reviewDTO = new ReviewDTO();
		
		reviewDTO.setBoardNo(reviewCommand.getBoardNo());
		reviewDTO.setbSubject(reviewCommand.getbSubject());
		reviewDTO.setbContent(reviewCommand.getbContent());
		reviewDTO.setMemId(reviewCommand.getMemId());
		
		reviewMapper.reviewUpdate(reviewDTO);
	
	
		
	}
}
