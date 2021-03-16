package sunshine.service.member;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	MemberDAO memberDao;
	
	//01 회원 로그인체크
	@Override
	public boolean loginCheck(MemberVO vo, javax.servlet.http.HttpSession session) {};
	
	
	

}
