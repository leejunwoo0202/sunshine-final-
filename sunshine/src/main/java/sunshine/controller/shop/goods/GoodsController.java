package sunshine.controller.shop.goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.command.GoodsCommand;
import sunshine.service.shop.goods.GoodsDeleteService;
import sunshine.service.shop.goods.GoodsDetailService;
import sunshine.service.shop.goods.GoodsListService;
import sunshine.service.shop.goods.GoodsUpdateService;
import sunshine.service.shop.goods.GoodsWriteService;

@Controller
@RequestMapping("goods")
public class GoodsController {
      
	@Autowired
	GoodsWriteService goodsWriteService;
	
	@Autowired
	GoodsListService goodsListService;
	
	@Autowired
	GoodsDetailService goodsDetailService;
	
	@Autowired
	GoodsDeleteService goodsDeleteService;
	
	@Autowired
	GoodsUpdateService goodsUpdateService;
	
	@RequestMapping("main")
	public String shopMain() {
		return "goods/main";
	}
	@RequestMapping("insert")
	public String shopInsert(GoodsCommand goodsCommand) {
		
		return "goods/insert";
	}
    @RequestMapping("insertPro")
    public String insertPro(GoodsCommand goodsCommand,
    		HttpServletRequest request) {
    	
    	goodsWriteService.goodsWrite(goodsCommand,request);
    	
    	return "goods/main";
    }  
    
    @RequestMapping("list")
    public String list(
    		@RequestParam(value ="page",defaultValue = "1")
    		Integer page, Model model) {
    	goodsListService.getGoodsList(model,page);
    	return "goods/list";
    }
    @RequestMapping("detail")
    public String detail(
    		@RequestParam(value = "goodsNum")String goodsNum,
    		Model model) {
        goodsDetailService.goodsDetail(goodsNum,model);	
    
    return "goods/detail";
    }
    
    @RequestMapping("delete")
    public String delete(@RequestParam(value = "goodsNum")
    String goodsNum,HttpSession session) {
    	goodsDeleteService.execute(goodsNum,session);
    	return "redirect:/goods/list";
    }
    
    @RequestMapping("modify")
    public String goodsModify(
    		@RequestParam(value = "goodsNum")String goodsNum,
    		Model model) {
    	goodsDetailService.goodsDetail(goodsNum, model);
    	return "goods/modify";
    }
    @RequestMapping("modifyPro")
    public String modifyPro(GoodsCommand goodsCommand,
    		HttpSession session) {
    	System.out.println("controllerGoodsNum:"+goodsCommand.getGoodsNum());
    	goodsUpdateService.execute(goodsCommand,session);
    	System.out.println(goodsCommand.getGoodsNum());
    	return "redirect:detail?goodsNum="+goodsCommand.getGoodsNum();
    }
    
    
    
    
}
