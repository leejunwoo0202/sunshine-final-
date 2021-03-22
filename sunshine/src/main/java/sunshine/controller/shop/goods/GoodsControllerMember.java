package sunshine.controller.shop.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.service.shop.goods.GoodsDetailService;
import sunshine.service.shop.goods.GoodsListService;
import sunshine.service.shop.goods.GoodsOrderInsertService;

@Component
@Controller
@RequestMapping("goodsMem")
public class GoodsControllerMember {
	@Autowired
	GoodsListService goodsListService;

	@Autowired
	GoodsDetailService goodsDetailService;

	@Autowired
	GoodsOrderInsertService goodsOrderInsertService;
	@RequestMapping("list")
	public String goodsList(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		goodsListService.getGoodsList(model, page);
		return "goods/memGoodsList";
	}

	@RequestMapping("detail")
	public String detail(

			@RequestParam(value = "goodsNum") String goodsNum, Model model) {
		System.out.println("goodsNum:" + goodsNum);
		goodsDetailService.goodsDetail(goodsNum, model);
		return "goods/memGoodsDetail";
	}
	
	@RequestMapping("orderInsert")
	public String orderInsert(
			@RequestParam(value ="goodsNum")String goodsNum,
			Model model, HttpSession session) {
		goodsOrderInsertService.goodsOrderAdd(goodsNum,model,session);
		return "goods/orderInsert";
	}
			
			
	
	

}