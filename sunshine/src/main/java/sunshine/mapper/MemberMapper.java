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
	
	//오버라이드
//	public MemberDTO selectByMember(MemberDTO memberDTO);
	
	public MemberDTO selectByMemberPw(MemberDTO memberDTO);
	//업데이트
	public void pwUpdate(MemberDTO memberDTO);
	
	public void deleteMember(String userId);

	public MemberDTO selectByMemberA(String memId); 
}
