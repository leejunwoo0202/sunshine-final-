package sunshine.mapper;

import java.util.List;

import sunshine.model.DTO.ReviewDTO;

public interface ReviewMapper {

	public void insertReview(ReviewDTO reviewDTO);

	public List<ReviewDTO> getReviewList(ReviewDTO reviewDTO);

	public Integer reviewCount();
    
}
