package sunshine.service.condo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import controller.PageAction;
import sunshine.mapper.CondoMapper;
import sunshine.model.DTO.CondoDTO;

@Component
@Service
public class RoomListService {

	@Autowired
	CondoMapper CondoMapper;
	public void getRoomList(Model model) throws Exception {
		
		CondoDTO condoDTO = new CondoDTO();
		List<CondoDTO> list = CondoMapper.RoomList(condoDTO);
		
		model.addAttribute("list",list);
	}
}
