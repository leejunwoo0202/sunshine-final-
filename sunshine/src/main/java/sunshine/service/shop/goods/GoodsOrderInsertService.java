package sunshine.service.shop.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.GoodsMapper;
import sunshine.mapper.MemberMapper;
import sunshine.model.LoginInfo;
import sunshine.model.DTO.GoodsDTO;
import sunshine.model.DTO.MemOrderDTO;
import sunshine.model.DTO.MemberDTO;

@Component
@Service
public class GoodsOrderInsertService {
    @Autowired
    GoodsMapper goodsMapper;
   
    @Autowired
    MemberMapper memberMapper;
    
    
    public void goodsOrderAdd(String goodsNum,Model model,
    		HttpSession session) {
    	GoodsDTO goodsDto = new GoodsDTO();
    	MemberDTO memDto = new MemberDTO();
    	goodsDto.setGoodsNum(goodsNum);
    	goodsDto = (GoodsDTO)goodsMapper.getGoodsList(goodsDto).get(0);
    	MemOrderDTO  order = new MemOrderDTO();
    	
    	//상품 정보 넣기

    	System.out.println("goodsDto.getGoodsNum():"+goodsDto.getGoodsNum());
    	order.setGoodsNum(goodsDto.getGoodsNum());

    	 order.setGoodsNum(goodsDto.getGoodsNum());

    	
    	model.addAttribute("goodsDTO",goodsDto);
    	//멤버 정보 넣기
    	
    	

    	String memId = ((LoginInfo) session.getAttribute("loginInfo")).getUserId();
    	memDto = memberMapper.selectByMemberA(memId);
    	model.addAttribute("memDTO",memDto);
		 order.setMemNo(memDto.getMemNo());
		 order.setMemName(memDto.getMemName());
	     order.setMemId(memDto.getMemId());
		 order.setMemPw(memDto.getMemPw());
		 order.setMemPhone(memDto.getMemPhone()); 
		 order.setMemEmail(memDto.getMemEmail());
		 order.setMemAddr(memDto.getMemAddr()); 
		 order.setMemRegist(memDto.getMemRegist()); 
		 order.setMemResidentNum(memDto.getMemResidentNum());
		 
		 
		 //회원주문 테이블 정보
		 
		 String mOrderNum = order.getmOrderNum();
        
    	
		


    }	
}
