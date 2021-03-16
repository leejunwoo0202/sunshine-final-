package sunshine.service.member;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Configuration;

@Configuration
public interface MemberService {
	//01 회원 로그인 체크
	public boolean loginCheck(MemberVO vo, HttpSession session);
	
	//02 회원 로그인 정보
	public MemberVO viewMember(MemberVO VO);
	
	//03.회원 로그아웃
	public void logout(HttpSession session);

}
