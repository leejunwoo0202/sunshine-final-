package sunshine.service.shop.goods;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import sunshine.command.GoodsCommand;
import sunshine.mapper.GoodsMapper;
import sunshine.model.DTO.GoodsDTO;

@Component
@Service
public class GoodsUpdateService {

	@Autowired
	GoodsMapper goodsMapper;
	public void execute(GoodsCommand goodsCommand,
			HttpSession session) {
		GoodsDTO dto = new GoodsDTO();
		System.out.println("goodsNum:"+goodsCommand.getGoodsNum());
		dto.setGoodsNum(goodsCommand.getGoodsNum());
		
		
		
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsPrice(goodsCommand.getGoodsPrice());
		dto.setGoodsAmount(goodsCommand.getGoodsAmount());
		dto.setGoodsCategori(goodsCommand.getGoodsCategori());
		dto.setGoodsContent(goodsCommand.getGoodsContent());
		
		
		goodsMapper.goodsUpdate(dto);
		
		
	}
	
}
