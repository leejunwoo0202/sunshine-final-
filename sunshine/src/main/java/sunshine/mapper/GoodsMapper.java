package sunshine.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.DTO.GoodsDTO;

@Component
@Repository
public interface GoodsMapper {

	
	public Integer goodsInsert(GoodsDTO dto);
	   
	public List<GoodsDTO> getGoodsList(GoodsDTO dto);
	
	public Integer getGoodsCount();
}
