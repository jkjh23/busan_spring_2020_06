package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.vo.BoardVO;

public interface BoardDAO {
	public int insertBoard(BoardVO obj);		// 글쓰기
	public List<BoardVO> selectBoard(HashMap<String, Object> map);
	public List<BoardVO> selectBoard2(HashMap<String, Object> map);
	public BoardVO selectBoardOne(int no);
	public int updateBoardOne(BoardVO obj);
	public int deleteBoard(BoardVO obj);
	
	public int countBoard();		// 전체 개수 구하기
	
	public int updateHit(int no);	// 글번호가 넘어오면 1 증가
	
	public int insertBatch(List<BoardVO> list);
	// Board.insertBatch mapper
	
	public BoardVO selectBoardImg(int no);
	
	public int selectBoardPrev(int no);
	public int selectBoardNext(int no);
}
