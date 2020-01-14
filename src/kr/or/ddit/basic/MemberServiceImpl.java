package kr.or.ddit.basic;

import java.util.List;

public class MemberServiceImpl implements IMemberService {

	private IMemberDao memDao;
	
	public MemberServiceImpl() {
		memDao = new MemberDaoImpl();
	}
	
	@Override
	public int insertMember(MemberVO mv) {
		return memDao.insertMember(mv);
	}

	@Override
	public boolean getMember(String memId) {
		return memDao.getMember(memId);
	}

	@Override
	public List<MemberVO> getAllMemberList() {
		return memDao.getAllMemberList();
	}

	@Override
	public int updateMember(MemberVO mv) {
		return memDao.updateMember(mv);
	}

	@Override
	public int deleteMembeR(String memId) {
		return memDao.deleteMembeR(memId);
	}

	@Override
	public List<MemberVO> getSearchMember(MemberVO mv) {
		return memDao.getSearchMember(mv);
	}

}
