package sunshine.service.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.ReviewMapper;
import sunshine.model.DTO.ReviewDTO;

@Service
public class ReviewDetailService {

	@Autowired
	ReviewMapper reviewMapper;
	
	public void reviewDetail(String boardNo,Model model) {
		ReviewDTO reviewDTO = new ReviewDTO();
		reviewDTO.setBoardNo(boardNo);
		
		List<ReviewDTO> list = reviewMapper.getReviewList(reviewDTO);
		model.addAttribute("detail",list.get(0));
		
		
		
		
	}
}
