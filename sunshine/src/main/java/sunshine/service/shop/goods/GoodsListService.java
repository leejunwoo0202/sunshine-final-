package sunshine.service.shop.goods;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.PageAction;
import sunshine.mapper.GoodsMapper;
import sunshine.model.DTO.GoodsDTO;
import sunshine.model.DTO.StartEndPageDTO;

@Component
@Service
public class GoodsListService {
    @Autowired
    GoodsMapper goodsMapper;
    
    public void getGoodsList(Model model,Integer page) {
    	int limit = 10;
    	int limitPage = 10;   
    	Long startRow = ((long)page -1) * limit + 1;
    	Long endRow = startRow + limit -1;
    	GoodsDTO dto = new GoodsDTO();
    	dto.setStartEndPageDTO(
    			new StartEndPageDTO(startRow,endRow));
    	
    	
    	List<GoodsDTO> list1 =
    			goodsMapper.getGoodsList(dto);
    	
    	
    	int count = goodsMapper.getGoodsCount();
    	model.addAttribute("list",list1);
    	model.addAttribute("count",count);
    	
    	PageAction pageAction = new PageAction();
    	pageAction.page(
    			model, count, limit, limitPage, page,"goodsList?");
    	
    }
	
}
