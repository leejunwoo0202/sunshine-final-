package sunshine.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.DTO.MemberDTO;
@Component
@Repository(value = "sunshine.mapper")
public interface MemberMapper {
	public Integer insertMember(MemberDTO memberDTO) ;
	
	public List<MemberDTO> selectByMember(MemberDTO memberDTO)throws Exception;
}
