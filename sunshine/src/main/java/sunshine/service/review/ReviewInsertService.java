package sunshine.service.review;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.command.ReviewCommand;
import sunshine.mapper.ReviewMapper;
import sunshine.model.LoginInfo;
import sunshine.model.DTO.ReviewDTO;

@Component
@Service
public class ReviewInsertService {

	@Autowired
	ReviewMapper reviewMapper;
	
	public void reviewInsert(ReviewCommand reviewCommand,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		String memId = ((LoginInfo) session.getAttribute("loginInfo")).getUserId();
		System.out.println(memId);
		ReviewDTO reviewDTO = new ReviewDTO();
	    reviewDTO.setbSubject(reviewCommand.getbSubject());
	    reviewDTO.setbContent(reviewCommand.getbContent());
	    reviewDTO.setMemId(memId);
	    
		reviewMapper.insertReview(reviewDTO);
		
		
		
		
	}

}
