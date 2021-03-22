package sunshine.service.condo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.CondoMapper;
import sunshine.model.DTO.CondoDTO;

@Service
@Component
public class RoomDetailService {
	@Autowired
	CondoMapper condoMapper;
	
	public void getRoomDetail(String roomNum, Model model) throws Exception{
		CondoDTO condoDTO = new CondoDTO();
		condoDTO.setRoomNum(roomNum);
		List<CondoDTO> list = condoMapper.RoomList(condoDTO);
		
		model.addAttribute("list", list);
		
	}

}
