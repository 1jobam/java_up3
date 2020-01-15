package tutorial;

import java.util.List;

public interface BoardService {
	
	public int insertBoard(BoardVO bv);
	
	public int updateBoard(BoardVO bv);
	
	public int deleteBoard(BoardVO bv);
	
	public List<BoardVO> getAllBoard();
	
	public List<BoardVO> getSearchBoard(BoardVO bv);

}
