package com.example.vue.search.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vue.movie.vo.MovieVo;

@Mapper
public interface SearchMapper {

	List<MovieVo> searchSelected(String searchQuery);

	
}
