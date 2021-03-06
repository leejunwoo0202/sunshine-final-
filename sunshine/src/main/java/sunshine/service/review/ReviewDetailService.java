package sunshine.service.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.ReviewMapper;
import sunshine.model.DTO.ReplyDTO;
import sunshine.model.DTO.ReviewDTO;

@Service
public class ReviewDetailService {

	@Autowired
	ReviewMapper reviewMapper;
	
	public void reviewDetail(String boardNo, Model model) {
		System.out.println("boardNo:" + boardNo);
		
		ReviewDTO reviewDTO = new ReviewDTO();
		reviewDTO.setBoardNo(boardNo);
		List<ReviewDTO> list = reviewMapper.getReviewList(reviewDTO);
		model.addAttribute("detail",list.get(0));
		
		ReplyDTO replyDTO = new ReplyDTO();
		replyDTO.setBoardNo(boardNo);
		
		List<ReplyDTO> listReply = reviewMapper.getReplyList(replyDTO);
		
		/*
		 * System.out.println("리뷰답글 : " + list1.get(0).getReplyNo());
		 * System.out.println(list1.get(0).getEmId());
		 * System.out.println(list1.get(0).getBoardNo());
		 */
		
		model.addAttribute("reply",listReply);
		
		
		
		
		
	}
}
	