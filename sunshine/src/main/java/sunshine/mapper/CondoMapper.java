package sunshine.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.DTO.CondoDTO;
@Component
@Repository

public interface CondoMapper {

	public Integer insertCondo(CondoDTO condoDTO) throws Exception; 
	
	public List<CondoDTO> RoomList(CondoDTO condoDTO) throws Exception;
		
	
}



