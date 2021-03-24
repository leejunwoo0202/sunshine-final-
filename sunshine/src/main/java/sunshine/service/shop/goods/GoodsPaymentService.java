package sunshine.service.shop.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.command.PaymentCommand;
import sunshine.mapper.GoodsMapper;
import sunshine.model.DTO.MemOrderDTO;

@Component
@Service
public class GoodsPaymentService {
       
	@Autowired
	GoodsMapper goodsMapper;
	
	public void goodsPayment(PaymentCommand paymentCommand, Model model) {
		
		String mOrderNum = goodsMapper.mOrderNum();
		MemOrderDTO memOrderDTO = new MemOrderDTO();
		System.out.println("paymentCommand.getGoodsNum:"+paymentCommand.getGoodsNum());
		System.out.println("paymentCommand.getMemNo:"+paymentCommand.getMemNo());
		memOrderDTO.setmOrderNum(mOrderNum);
		String goodsAmount = paymentCommand.getGoodsAmountOrder();
		String goodsPrice = paymentCommand.getGoodsPrice();
		System.out.println(goodsAmount);
		String goodsTotalPrice = String.valueOf(Integer.parseInt(goodsAmount) *  Integer.parseInt(goodsPrice));
		
		memOrderDTO.setmOrderNum(mOrderNum);
		
		memOrderDTO.setGoodsNum(paymentCommand.getGoodsNum());
		memOrderDTO.setGoodsTotalPrice(goodsTotalPrice);
		
		memOrderDTO.setMemNo(paymentCommand.getMemNo());
		memOrderDTO.setMemName(paymentCommand.getMemName());
		memOrderDTO.setMemId(paymentCommand.getMemId());
		memOrderDTO.setMemPhone(paymentCommand.getMemPhone());
		memOrderDTO.setMemEmail(paymentCommand.getMemEmail());
		memOrderDTO.setMemAddr(paymentCommand.getMemAddr());
		
		model.addAttribute("mOrderNum", mOrderNum);
		
		
		goodsMapper.paymentInsert(memOrderDTO);
		
		
		
		
		
	}

	public void goodsPaymentPro(PaymentCommand paymentCommand, Model model) {
		MemOrderDTO memOrderDTO = new MemOrderDTO();
		
		
		memOrderDTO.setmOrderNum(paymentCommand.getmOrderNum());
		memOrderDTO.setDeliveryAddress(paymentCommand.getDeliveryAddress());
		memOrderDTO.setPayDivision(paymentCommand.getPayDivision());
		
		goodsMapper.paymentInsertPro(memOrderDTO);
		
		
	}
            
	
	
	
}
