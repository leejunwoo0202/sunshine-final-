package sunshine.contoller.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.command.ReviewCommand;
import sunshine.service.review.ReviewDeleteService;
import sunshine.service.review.ReviewDetailService;
import sunshine.service.review.ReviewInsertService;
import sunshine.service.review.ReviewListService;
import sunshine.service.review.ReviewUpdateService;

@Controller
@RequestMapping("review")
public class ReviewController {

	@Autowired
	ReviewInsertService reviewInsertService;
	
	@Autowired
	ReviewListService reviewListService;
	
	@Autowired
	ReviewDetailService reviewDetailService;
	
	@Autowired
	ReviewDeleteService reviewDeleteService;
	
	@Autowired
	ReviewUpdateService reviewUpdateService;
	
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
	       
	       @RequestMapping("detail")
	       public String reviewDetail(
	    		   @RequestParam(value = "boardNo" ) String boardNo,
	    		   Model model) {
	    	   reviewDetailService.reviewDetail(boardNo, model);
	    	   return "review/reviewDetail";
	       }
	       
	       @RequestMapping("delete")
	       public String reviewDelete(@RequestParam(value = "boardNo")
	       String boardNo,HttpSession session) {
	    	   reviewDeleteService.execute(boardNo,session);
	    	   return "redirect:/review/reviewList";
	    	   
	       }
	       
	       @RequestMapping("modify")
	       public String reviewModify(
	    		   @RequestParam(value = "boardNo")String boardNo,
	       Model model){  
	    	   reviewDetailService.reviewDetail(boardNo,model);
	    	   return "review/reviewModify";
	    	   
	       }   
	       
	       @RequestMapping("modifyPro")
	       public String modifyPro(ReviewCommand reviewCommand,
	    		   HttpSession session) {
	    	   reviewUpdateService.execute(reviewCommand,session);
	    	   return "redirect:/review/reviewList";
	    	   
	       }
	      
	       
	       
	       
	       }
	    		   

