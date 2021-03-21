package sunshine.controller.shop.goods;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
    		HttpServletRequest request,
    		@RequestParam("goodsImage") MultipartFile mfile) {
    	try {
			mfile.transferTo(new File("C:\\Users\\roll master\\git\\sunshine-final-\\sunshine\\src\\main\\webapp\\WEB-INF\\view\\goods\\upload"+
				mfile.getOriginalFilename()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
