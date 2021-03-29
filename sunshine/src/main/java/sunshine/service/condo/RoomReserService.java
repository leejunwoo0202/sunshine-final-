package sunshine.service.condo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import sunshine.mapper.CondoMapper;

@Component
@Service
public class RoomReserService {
	@Autowired
	CondoMapper condoMapper;
	
	public void roomReser(Model model, HttpSession session) {
		
		
	}
}
