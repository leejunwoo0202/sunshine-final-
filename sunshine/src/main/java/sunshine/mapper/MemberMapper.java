package sunshine.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.DTO.MemberDTO;
@Component
@Repository
public interface MemberMapper {
	public Integer insertMember(MemberDTO memberDTO) ;
}
