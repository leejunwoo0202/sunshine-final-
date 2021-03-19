package sunshine.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.DTO.GoodsDTO;

@Component
@Repository
public interface GoodsMapper {

	
	public GoodsDTO goodsInsert(GoodsDTO dto);
	   
}
