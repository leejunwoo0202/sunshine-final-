package sunshine.contoller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("review")
public class ReviewController {

	       @RequestMapping("main")
	       public String reviewMain() {
	    	   return "review/main";
	       }
	       
	       @RequestMapping("reviewInsert")
	       public String reviewInsert() {
	    	   return "review/reviewInsert";
	       }
	       
}
