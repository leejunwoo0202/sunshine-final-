package sunshine.controller.shop.goods;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.command.GoodsCommand;
import sunshine.service.shop.goods.GoodsListService;
import sunshine.service.shop.goods.GoodsWriteService;

@Controller
@RequestMapping("goods")
public class GoodsController {
      
	@Autowired
	GoodsWriteService goodsWriteService;
	
	@Autowired
	GoodsListService goodsListService;
	
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
   
	
}
