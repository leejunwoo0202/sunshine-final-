package sunshine.service.shop.goods;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.mapper.GoodsMapper;
import sunshine.model.DTO.GoodsDTO;

@Component
@Service
public class GoodsDeleteService {

	@Autowired
	GoodsMapper goodsMapper;
	

	public void execute(String goodsNum, HttpSession session) {
	     GoodsDTO dto = new GoodsDTO();
	     dto.setGoodsNum(goodsNum);
	     
	     dto = goodsMapper.getGoodsList(dto).get(0);
	     String filePath = 
	    		 session.getServletContext().getRealPath(
	    				 "WEB-INF/view/goodsView/upload");
	     String[] store = dto.getGoodsImage().split("`");
	     for(String f:store) {
	    	 File file = new File(filePath + "/" +f);
	    	 file.delete();
	     }
	     goodsMapper.goodsDelete(goodsNum);
		
	}
}