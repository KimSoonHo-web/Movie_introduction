package com.example.vue.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vue.board.model.BoardService;
import com.example.vue.board.vo.BoardVo;

@RestController
@RequestMapping("/api")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/boardList")
	public List<BoardVo> userList() throws Exception {

		//System.out.println("boardList");
		List<BoardVo> boardList = boardService.boardList();
		//System.out.println("boardList : " + boardList );
		return boardList;
	}
	
	
	//영화 전체 리스트
	@GetMapping("/all-movies")
	public List<BoardVo> movieAllList() throws Exception {

		List<BoardVo> movieAllList = boardService.movieAllList();
		//System.out.println("movieAllList : " + movieAllList );
		return movieAllList;
	}
	
	// 영화 상세
	@GetMapping("/movieDetail")
    public List<BoardVo> getMovieByIdl(@RequestParam int id) {
		
		 List<BoardVo> movieDetail=  boardService.getMovieById(id);
		
		//System.out.println("movieDetail : " + movieDetail );
		
        return movieDetail;
    }
	 
	
	
	
}
