package sunshine.service.condo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.PageAction;
import sunshine.mapper.CondoMapper;
import sunshine.model.DTO.CondoDTO;
import sunshine.model.DTO.GoodsDTO;
import sunshine.model.DTO.StartEndPageDTO;

@Component
@Service
public class RoomListService {

	@Autowired
	CondoMapper condoMapper;
	public void getRoomList(Integer page, Model model) throws Exception {
		
		int limit = 10;
    	int limitPage = 10;
    	Long startRow = ((long)page -1) * limit + 1;
    	Long endRow = startRow + limit -1;
    	CondoDTO condoDTO = new CondoDTO();
    	condoDTO.setStartEndPageDTO(
    			new StartEndPageDTO(startRow,endRow));
    	
		List<CondoDTO> list = condoMapper.RoomList(condoDTO);
		int count = condoMapper.getRoomCount(condoDTO);
		model.addAttribute("list",list);
    	model.addAttribute("count",count);
    	
    	PageAction pageAction = new PageAction();
    	pageAction.page(
    			model, count, limit, limitPage, page,"roomList?");
		
	}
}
