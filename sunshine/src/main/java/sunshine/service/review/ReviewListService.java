package sunshine.service.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.PageAction;
import sunshine.mapper.ReviewMapper;
import sunshine.model.DTO.ReviewDTO;
import sunshine.model.DTO.StartEndPageDTO;

@Service
public class ReviewListService {

	@Autowired
	ReviewMapper reviewMapper;
	
	public void execute(Integer page, Model model) {
		int limit = 10;
		int limitPage = 10;
		Long startRow = ((long)page - 1) *  limit + 1;
		Long endRow = startRow + limit -1;
		
		ReviewDTO reviewDTO = new ReviewDTO();
		reviewDTO.setStartEndPageDTO(new StartEndPageDTO(startRow,endRow));
		
		List<ReviewDTO> list = reviewMapper.getReviewList(reviewDTO);
		Integer count = reviewMapper.reviewCount();
		
		model.addAttribute("lists", list);
		model.addAttribute("count", count);
		
		PageAction pageAction = new PageAction();
		System.out.println("1"+model);
		System.out.println("2"+count);
		System.out.println("3"+limit);
		System.out.println("4"+limitPage);
		System.out.println("5"+page);
		
		pageAction.page(model, count, limit, limitPage, page, "reviewList?");
	}
}
