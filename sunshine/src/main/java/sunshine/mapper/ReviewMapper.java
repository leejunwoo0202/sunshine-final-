package sunshine.mapper;

import java.util.List;

import sunshine.model.DTO.ReplyDTO;
import sunshine.model.DTO.ReviewDTO;

public interface ReviewMapper {

	public void insertReview(ReviewDTO reviewDTO);

	public List<ReviewDTO> getReviewList(ReviewDTO reviewDTO);

	public Integer reviewCount();

	public void reviewDelete(String boardNo);

	public void reviewUpdate(ReviewDTO reviewDTO);

	public void insertReviewEm(ReplyDTO replyDTO);

	public List<ReplyDTO> getReplyList(ReplyDTO replyDTO);

	public void replyDelete(String boardNo);
    
}
