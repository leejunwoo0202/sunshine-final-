package sunshine.service.shop.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import sunshine.mapper.GoodsMapper;
import sunshine.model.DTO.GoodsDTO;
import sunshine.model.DTO.MemOrderDTO;
import sunshine.model.DTO.MemberDTO;

public class GoodsOrderInsertService {
    @Autowired
    GoodsMapper goodsMapper;
   
    public void goodsOrderAdd(String goodsNum,Model model,
    		HttpSession session) {
    	GoodsDTO goodsDto = new GoodsDTO();
    	MemberDTO memDto = new MemberDTO();
    	goodsDto.setGoodsNum(goodsNum);
    	goodsDto = (GoodsDTO)goodsMapper.getGoodsList(goodsDto).get(0);
    	MemOrderDTO  order = new MemOrderDTO();
    	
    	//상품 정보 넣기
    	 order.setGoodsNum(goodsDto.getGoodsNum());
    	
    	//멤버 정보 넣기
		/*
		 * order.setMemNo(memDto.getMemNo()); order.setMemName(mOrderDate);
		 * order.setMemId order.setMemPw(memPw); order.setMemPhone order.getMemEmail()
		 * order.setMemAddr order.setMemRegist order.setResidentNum
		 */
    	
    	
		/*
		 * LoginInfo loginInfo = (LoginInfo)session.getAttribute("loginInfo"); String
		 * memId = loginInfo.getUserId(); order.setMemId(memId); Integer i =
		 * goodsMapper.goodsOrderAdd(order); model.addAttribute("val",i);
		 */
    	
    }
	
}
