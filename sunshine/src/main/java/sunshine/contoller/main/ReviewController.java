package sunshine.contoller.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.command.ReviewCommand;
import sunshine.service.review.ReviewInsertService;
import sunshine.service.review.ReviewListService;

@Controller
@RequestMapping("review")
public class ReviewController {

	@Autowired
	ReviewInsertService reviewInsertService;
	
	@Autowired
	ReviewListService reviewListService;
	
	       @RequestMapping("main")
	       public String reviewMain() {
	    	   return "review/main";
	       }
	       
	       @RequestMapping("reviewInsert")
	       public String reviewInsert() {
	    	   
	    	   return "review/reviewInsert";
	       }
	       
	       @RequestMapping("reviewInsertPro")
	       public String reviewInsertPro(ReviewCommand reviewCommand,
	    		   HttpServletRequest request) {
	    	       reviewInsertService.reviewInsert(reviewCommand,request);
	    	   
	    	   return "review/main";
	       }
	       
	       @RequestMapping("reviewList")
	       public String reviewList(
	    		   @RequestParam(value = "page", defaultValue = "1") Integer page,
	    		   Model model) {
	    	   reviewListService.execute(page,model);
	    	   return "review/reviewList";
	       }
	       }
	    		   

