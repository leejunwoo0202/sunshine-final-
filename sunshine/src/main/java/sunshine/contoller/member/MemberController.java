/*
 * package sunshine.contoller.member;
 * 
 * import javax.inject.Inject; import javax.servlet.http.HttpSession;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import sunshine.service.member.MemberService;
 * 
 * @Controller
 * @RequestMapping("/condo/*") 
 * public class MemberController {
 * 
 * 
 * 
 * @Inject MemberService memberService;
 * 
 * // 01 로그인 화면
 * 
 * @RequestMapping("condoMain") 
 * public String login() { return "member/login"; }
 * 
 * // 02 로그인 처리
 * 
 * @RequestMapping("loginCheck") 
 * public ModelAndView
 * loginCheck(@ModelAttribute MemberVO,HttpSession session) { boolean result =
 * memberService.loginCheck(vo,session); ModelAndView mav = new ModelAndView();
 * if(result == true) { mav.setViewName("home"); mav.addObject("msg","success");
 * }else { mav.setViewName("member/login"); mav.addObject("msg","success"); }
 * 
 * return mav; }
 * 
 * //03 로그아웃 처리
 * 
 * @ReuqestMapping("logout.do") public ModelAndView logout(HttpSession session)
 * { memberService.logout(session); ModelAndView mav = new ModelAndView();
 * mav.setViewName("member/login"); mav.addObject("msg","logout"); return mav; }
 * 
 * }
 * 
 */