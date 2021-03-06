package sunshine.service.shop.goods;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.PageAction;
import sunshine.mapper.GoodsMapper;
import sunshine.model.LoginInfo;
import sunshine.model.DTO.GoodsDTO;
import sunshine.model.DTO.PaymentDTO;
import sunshine.model.DTO.StartEndPageDTO;

@Component
@Service
public class GoodsPaymentListService {
	@Autowired
	GoodsMapper goodsMapper;
	
	

	public void goodsPayList(Model model, Integer page,HttpSession session) {
		int limit = 10;
		int limitPage = 10;
		Long startRow = ((long)page -1) * limit +1;
		Long endRow = startRow + limit -1;
		GoodsDTO dto = new GoodsDTO();
		dto.setStartEndPageDTO(
				new StartEndPageDTO(startRow, endRow));
		
		PaymentDTO paymentDTO = new PaymentDTO();
		String memId = ((LoginInfo) session.getAttribute("loginInfo")).getUserId();
		System.out.println(memId);
		
		List<PaymentDTO> list = 
				goodsMapper.getPaymentList(memId);
		int count = goodsMapper.getPaymentCount(paymentDTO);
		model.addAttribute("list",list);
		model.addAttribute("count",count);
		
		PageAction pageAction = new PageAction();
		pageAction.page(model, count, limit, limitPage, page, "paymentList?");
		
	}
}
