package sunshine.service.contents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sunshine.mapper.ContentsMapper;

@Component
@Service
public class ContentsDeleteService {
	@Autowired
	ContentsMapper contentsMapper;
	public void execute(String contentsNo) {
	contentsMapper.contentsDelete(contentsNo);
	}
}
