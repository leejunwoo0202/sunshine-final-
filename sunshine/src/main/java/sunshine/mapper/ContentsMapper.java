package sunshine.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.DTO.ContentsDTO;

@Repository
@Component
public interface ContentsMapper {
	public void contentsRegist(ContentsDTO contentsDTO);
	public List<ContentsDTO> contentsList(ContentsDTO contentsDTO);
	public ContentsDTO contentsDetail(String contentsNo);
	public void contentsModify(ContentsDTO contentsDTO);
	public void contentsDelete(String contentsNo);
	
}
