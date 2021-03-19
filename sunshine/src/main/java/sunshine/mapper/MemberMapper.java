package sunshine.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.LoginInfo;
import sunshine.model.DTO.MemberDTO;
@Component
@Repository(value = "sunshine.mapper")
public interface MemberMapper {
	//회원가입
	public Integer insertMember(MemberDTO memberDTO) ;
	
    //내정보
	public MemberDTO selectByMember(String memId);
	
	public MemberDTO selectByMemberPw(MemberDTO memberDTO);
	
	public void pwUpdate(MemberDTO memberDTO);
}
