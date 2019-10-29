package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service
public class BoardServicelmpl implements BoardService {
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}
	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);
	}
	@Override
	public BoardVO view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(bno);
	}
	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.modify(vo);
	}

}
