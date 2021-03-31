package sunshine.service.contents;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.ContentsMapper;
import sunshine.model.DTO.ContentsDTO;

@Component
@Service
public class ContentsListService {
	@Autowired
	ContentsMapper contentsMapper;
	public void execute(Model model) throws Exception {
		ContentsDTO dto = new ContentsDTO();
		List<ContentsDTO> list = contentsMapper.contentsList(dto);
		model.addAttribute("list", list);
	}
}
