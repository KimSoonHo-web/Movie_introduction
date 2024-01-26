package com.example.vue.search.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vue.movie.vo.MovieVo;
import com.example.vue.search.mapper.SearchMapper;

@Service
public class SearchService {

	@Autowired
	SearchMapper searchMapper;

	public List<MovieVo> searchSelected(String searchQuery) {
		return searchMapper.searchSelected(searchQuery);
	}
}
