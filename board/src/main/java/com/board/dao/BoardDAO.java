package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {
	public List list() throws Exception;
	public void write(BoardVO vo) throws Exception;
	public BoardVO view(int bno) throws Exception;
	public void modify(BoardVO vo) throws Exception;
}
