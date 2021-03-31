package sunshine.service.contents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sunshine.command.ContentsCommand;
import sunshine.mapper.ContentsMapper;
import sunshine.model.DTO.ContentsDTO;

@Service
public class ContentsModifyService {
	@Autowired
	ContentsMapper contentsMapper;
	public void execute(ContentsCommand contentsCommand) {
		ContentsDTO contentsDTO = new ContentsDTO();
		contentsDTO.setContentsNo(contentsCommand.getContentsNo());
		contentsDTO.setContentsName(contentsCommand.getContentsName());
		contentsDTO.setContentsPrice(contentsCommand.getContentsPrice());
		contentsDTO.setContentsDiv(contentsCommand.getContentsDiv());
		contentsMapper.contentsModify(contentsDTO);
	}
}
