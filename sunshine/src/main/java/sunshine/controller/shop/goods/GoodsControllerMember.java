package sunshine.controller.shop.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sunshine.command.PaymentCommand;
import sunshine.service.shop.goods.GoodsDetailService;
import sunshine.service.shop.goods.GoodsListService;
import sunshine.service.shop.goods.GoodsOrderInsertService;
import sunshine.service.shop.goods.GoodsPaymentService;

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
	
	@Autowired
	GoodsPaymentService goodsPaymentService;
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
		return "goods/orderList";
	}
	
	
	//주문하기
	
	@RequestMapping("paymentInsert")
	public String paymentInsert(
			PaymentCommand paymentCommand,Model model) {
		goodsPaymentService.goodsPayment(paymentCommand,model);
		return "goods/paymentInsert";
	}
	
	//결제하기
	
	@RequestMapping("paymentInsertPro")
	public String paymentInsertPro(
			PaymentCommand paymentCommand, Model model) {
		goodsPaymentService.goodsPaymentPro(paymentCommand,model);
		return "goods/paymentProList";
	}
			
			
			
			
	
	

}
