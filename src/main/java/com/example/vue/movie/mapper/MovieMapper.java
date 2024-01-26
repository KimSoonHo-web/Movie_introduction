package com.example.vue.movie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vue.movie.vo.MovieVo;

@Mapper
public interface MovieMapper {
	
	/**
	 * 영화 리스트 조회
	 * @return
	 */
	List<MovieVo> findAll();

	void insertMovie(MovieVo movie);

	void deleteMovie(Long id);

	int updateMovie(MovieVo movieDetails);

}
