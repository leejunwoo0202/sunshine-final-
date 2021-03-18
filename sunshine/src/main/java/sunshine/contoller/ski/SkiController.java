//package sunshine.contoller.ski;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import sunshine.command.TicketCommand;
//import sunshine.service.ski.TicketService;
//
//@Controller
//@RequestMapping(value= "ski")
//public class SkiController {
//	@Autowired
//	TicketService ticketService;
//	@RequestMapping(value="skiMain")
//	public String skiMain(){
//		return "ski/index";
//    }
//	@RequestMapping(value="ticketInsert")
//	public String ticketInsert() {
//		return "ski/ticketInsert";
//	}
//	
//	
//	@RequestMapping(value="ticketIssue")
//	public String ticketIssue(TicketCommand ticketCommand) {
//		ticketService.ticketIssue(ticketCommand); //메소드 전달
//		return "redirect:/ski/ticketInsert";
//	}
//	
//}
