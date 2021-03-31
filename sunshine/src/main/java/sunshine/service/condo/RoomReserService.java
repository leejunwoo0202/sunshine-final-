package sunshine.service.condo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.command.CondoReserCommand;
import sunshine.mapper.CondoMapper;
import sunshine.model.DTO.CondoReserDTO;

@Component
@Service
public class RoomReserService {
	@Autowired
	CondoMapper condoMapper;
	
	public void roomReser(Model model, HttpSession session , CondoReserCommand command) {
	CondoReserDTO condoReserDTO = new CondoReserDTO();
	Integer result = null;
	
	condoReserDTO.setReserNum(condoReserDTO.getReserNum());
	condoReserDTO.setMemNo(condoReserDTO.getMemNo());
	condoReserDTO.setReserDate(condoReserDTO.getReserDate());
	condoReserDTO.setReserName(condoReserDTO.getReserName());
	condoReserDTO.setReserAdult(condoReserDTO.getReserAdult());
	condoReserDTO.setReserPhone(condoReserDTO.getReserPhone());
	condoReserDTO.setReserRoom(condoReserDTO.getReserRoom());
	condoReserDTO.setReserKids(condoReserDTO.getReserKids());
	condoReserDTO.setChkIn(condoReserDTO.getChkIn());
	condoReserDTO.setChkOut(condoReserDTO.getChkOut());
		
	result = condoMapper.insertReser(condoReserDTO);
	}
}
