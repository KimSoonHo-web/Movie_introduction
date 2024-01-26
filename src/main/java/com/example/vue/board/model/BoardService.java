package com.example.vue.board.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vue.board.mapper.BoardMapper;
import com.example.vue.board.vo.BoardVo;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	public List<BoardVo> boardList() {
		
		return boardMapper.boardList();
	}
	
	// 영화 전체 리스트
	public List<BoardVo> movieAllList() {
		// TODO Auto-generated method stub
		return boardMapper.movieAllList();
	}

	public List<BoardVo> getMovieById(int id) {
		// TODO Auto-generated method stub
		return boardMapper.getMovieById(id);
	}

}
