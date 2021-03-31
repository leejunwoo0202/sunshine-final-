package sunshine.service.rserv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sunshine.mapper.RservMapper;

@Service
public class RservListService {
	@Autowired
	RservMapper rservMapper;
	
}
