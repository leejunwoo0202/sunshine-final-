package sunshine.service.review;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sunshine.mapper.ReviewMapper;
import sunshine.model.DTO.ReviewDTO;

@Service
public class ReviewDeleteService {

	@Autowired
	ReviewMapper reviewMapper;
	
	public void execute(String boardNo,HttpSession session) {
		ReviewDTO dto = new ReviewDTO();
		dto.setBoardNo(boardNo);
		System.out.println(dto.getBoardNo());
		
		dto = reviewMapper.getReviewList(dto).get(0);
		
		reviewMapper.replyDelete(boardNo);
		reviewMapper.reviewDelete(boardNo);
	}
	
	
}
