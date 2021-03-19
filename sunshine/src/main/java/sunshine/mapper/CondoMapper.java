package sunshine.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.DTO.CondoDTO;
@Component
@Repository

public interface CondoMapper {
	public Integer insertCondo(CondoDTO condoDTO);
}

