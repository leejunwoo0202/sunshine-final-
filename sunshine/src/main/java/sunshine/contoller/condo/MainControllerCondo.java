package sunshine.contoller.condo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/condo")
public class MainControllerCondo {

	@RequestMapping("/main")
    public String logout(HttpSession session) {
   	 session.invalidate();
   	 return "redirect:/";
    }
}
