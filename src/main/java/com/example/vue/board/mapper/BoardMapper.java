package com.example.vue.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vue.board.vo.BoardVo;

@Mapper
public interface BoardMapper {

	List<BoardVo> boardList();

	List<BoardVo> movieAllList();

	List<BoardVo> getMovieById(int id);

}
