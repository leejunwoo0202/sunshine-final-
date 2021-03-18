
  package sunshine.controller.member;
  
  import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import
  org.springframework.stereotype.Controller;
import
  org.springframework.ui.Model;
import
  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.service.member.MemberInfoService;
  
  @Controller
  @RequestMapping("mem") 
  public class MemberInfoController {
  
  @Autowired 
  MemberInfoService memberInfoService;
  @RequestMapping("detail")
  public String memDetail(HttpSession session ,Model model) {
	  memberInfoService.execute(session,model);
	  return "member/detail";
  
  
  
  }
  
  }
 
