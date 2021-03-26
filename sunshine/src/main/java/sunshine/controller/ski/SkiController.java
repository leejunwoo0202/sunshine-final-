package sunshine.controller.ski;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.command.ContentsCommand;
import sunshine.service.contents.ContentsDeleteService;
import sunshine.service.contents.ContentsDetailService;
import sunshine.service.contents.ContentsListService;
import sunshine.service.contents.ContentsModifyService;
import sunshine.service.contents.ContentsRegistService;

@Controller
@RequestMapping(value = "ski")
public class SkiController {
	@Autowired
	ContentsRegistService contentsRegistService;
	@Autowired
	ContentsListService contentsListService;
	@Autowired
	ContentsDetailService contentsDetailService;
	@Autowired
	ContentsModifyService contentsModifyService;
	@Autowired
	ContentsDeleteService contentsDeleteService;
	
	@RequestMapping(value = "skiMain")
	public String skiMain() {
		return "ski/skiMain";
	}
	@RequestMapping(value = "contentsRegist")
	public String contentsRegist(ContentsCommand contentsCommand) {
		return "ski/contentsRegist";
	}
	@RequestMapping(value = "contentsRegistOk")
	public String contentsRegistOk(ContentsCommand contentsCommand) {
		contentsRegistService.execute(contentsCommand);
		return "ski/contentsRegistOk";
	}
	@RequestMapping(value = "contentsList")
	public String contentsList(Model model) {
	contentsListService.execute(model);
		return "ski/contentsList";
	}
	@RequestMapping(value = "contentsDetail")
	public String contentsDetail(
			@RequestParam(value= "contentsNo")String contentsNo, Model model) {
		contentsDetailService.execute(contentsNo, model);
		return "ski/contentsDetail";
	}
	@RequestMapping(value= "contentsModify")
	public String contentsModify(
			@RequestParam(value="contentsNo") String contentsNo, Model model, ContentsCommand contentsCommand) {
		contentsDetailService.execute(contentsNo, model);
		return "ski/contentsModify";
	}
	@RequestMapping(value= "contentsModifyOk")
	public String contentsModifyOk(
			ContentsCommand contentsCommand) {
		contentsModifyService.execute(contentsCommand);
		return "redirect:/ski/contentsDetail?contentsNo="+contentsCommand.getContentsNo();
	}
	@RequestMapping(value= "contentsDelete")
	public String contentsDelete(@RequestParam(value="contentsNo") String contentsNo) {
		contentsDeleteService.execute(contentsNo);
		return "redirect:/ski/contentsList";
	}
}
