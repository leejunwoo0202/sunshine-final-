package sunshine.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.LoginInfo;

@Component
@Repository
public interface LoginMapper {
	public LoginInfo loginUser(String loginId);

	
	
	    
}
