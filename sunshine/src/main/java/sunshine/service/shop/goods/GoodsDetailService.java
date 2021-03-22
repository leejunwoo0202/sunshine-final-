package sunshine.service.shop.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.GoodsMapper;
import sunshine.model.DTO.GoodsDTO;

@Component
@Service
public class GoodsDetailService {

	@Autowired
	GoodsMapper goodsMapper;
	public void goodsDetail(String goodsNum,Model model) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsNum(goodsNum);
		
		List<GoodsDTO> list = goodsMapper.getGoodsList(dto);
		model.addAttribute("goods",list.get(0));
	}
}
