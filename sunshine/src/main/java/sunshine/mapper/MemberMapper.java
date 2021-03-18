package sunshine.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.DTO.MemberDTO;
@Component
@Repository(value = "sunshine.mapper")
public interface MemberMapper {
	//회원가입
	public Integer insertMember(MemberDTO memberDTO) ;
	
    //내정보
	public MemberDTO getMemberDetail(MemberDTO dto)throws Exception;

}
