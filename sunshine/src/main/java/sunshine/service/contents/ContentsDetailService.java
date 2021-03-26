package sunshine.service.contents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.ContentsMapper;
import sunshine.model.DTO.ContentsDTO;

@Service
public class ContentsDetailService {
	@Autowired
	ContentsMapper contentsMapper;
	public void execute(String contentsNo, Model model) {
	ContentsDTO dto = contentsMapper.contentsDetail(contentsNo);
	model.addAttribute("contents", dto);
	}
}
