package service.Auth;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.DTO.MemberDTO;

public class MemberRepository {

	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "mapper.member.memberMapper";
	private String statement;
	
	public Integer deleteMember(MemberDTO memberDTO) {
		statement = namespace + ".deleteMember";
		return sqlSession.update(statement,memberDTO);
	}
	
	public Integer pwUpdate(MemberDTO memberDTO) {
		statement = namespace + ".updateMemberPw";
		return sqlSession.update(statement,memberDTO);
	}
	
	public Integer updateMember(MemberDTO memberDTO) {
		statement = namespace + ".updateMember";
		return sqlSession.update(statement,memberDTO);
	}
	
	public MemberDTO selectByMember(MemberDTO memberDTO) {
		statement = namespace + ".selectMember";
		return sqlSession.selectOne(statement,memberDTO);
	}
	
	public Integer joinOkUpdate(MemberDTO memberDTO) {
		statement = namespace + ".joinOkUpdate";
		return sqlSession.update(statement,memberDTO);
	}
	
	public Integer insertMember(MemberDTO memberDTO) {
		statement = namespace + ".memberInsert";
		return sqlSession.update(statement,memberDTO);
	}
	
	
	
	
	
	
}
