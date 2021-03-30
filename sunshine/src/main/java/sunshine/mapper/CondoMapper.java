package sunshine.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import sunshine.command.CondoCommand;
import sunshine.model.DTO.CondoDTO;
import sunshine.model.DTO.CondoReserDTO;
@Component
@Repository

public interface CondoMapper {

	public Integer insertCondo(CondoDTO condoDTO) throws Exception; 
	
	public List<CondoDTO> RoomList(CondoDTO condoDTO) throws Exception;

	public int getRoomCount(CondoDTO condoDTO) throws Exception;
	
	public Integer condoModify(CondoDTO condoDTO) throws Exception;

	public Integer roomDel(CondoDTO condoDTO);

	public Integer insertReser(CondoReserDTO condoReserDTO);
	
}



