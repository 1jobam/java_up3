package tutorial;

import java.util.List;

public class BoardServiceImpl implements BoardService {

	private BoardDao bodao;
	
	public BoardServiceImpl() {
		bodao = new BoardDaoImpl();
	}
	
	@Override
	public int insertBoard(BoardVO bv) {
		return bodao.insertBoard(bv);
	}

	@Override
	public int updateBoard(BoardVO bv) {
		return bodao.updateBoard(bv);
	}

	@Override
	public int deleteBoard(BoardVO bv) {
		return bodao.deleteBoard(bv);
	}

	@Override
	public List<BoardVO> getAllBoard() {
		return bodao.getAllBoard();
	}

	@Override
	public List<BoardVO> getSearchBoard(BoardVO bv) {
		return bodao.getSearchBoard(bv);
	}

}
