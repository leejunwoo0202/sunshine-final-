package sunshine.controller.shop.goods;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sunshine.command.GoodsCommand;
import sunshine.service.shop.goods.GoodsWriteService;

@Controller
@RequestMapping("goods")
public class GoodsController {
      
	@Autowired
	GoodsWriteService goodsWriteService;
	
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
    	
    	return "redirect:/goods/main";
    }  
   
	
}
