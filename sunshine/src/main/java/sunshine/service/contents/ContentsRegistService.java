package sunshine.service.contents;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.command.ContentsCommand;
import sunshine.mapper.ContentsMapper;
import sunshine.model.DTO.ContentsDTO;

@Component
@Service
public class ContentsRegistService {
	@Autowired
	ContentsMapper contentsMapper;
	public void execute(ContentsCommand contentsCommand) {
		ContentsDTO contentsDTO = new ContentsDTO();
		
		contentsDTO.setContentsName(contentsCommand.getContentsName());
		contentsDTO.setContentsPrice(contentsCommand.getContentsPrice());
		contentsDTO.setDivPeople(contentsCommand.getDivPeople());
		contentsDTO.setIssueDate(new Timestamp(contentsCommand.getIssueDate().getTime()));
		contentsDTO.setValidity(contentsCommand.getValidity());
		contentsDTO.setContentsDiv(contentsCommand.getContentsDiv());
		contentsMapper.contentsRegist(contentsDTO);
	}
}
