package com.example.vue.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vue.movie.vo.MovieVo;
import com.example.vue.search.model.SearchService;

@RestController
@RequestMapping("/api")
public class SearchController {

	@Autowired
	SearchService searchService;
	
	@GetMapping("/search")
	public List<MovieVo> searchSelected(@RequestParam String searchQuery){
		
		System.out.println("searchQuery : " + searchQuery);
		
		List<MovieVo> searchList = searchService.searchSelected(searchQuery);
		
		System.out.println("searchList : " + searchList);
		
		return searchList;
	}
	
	
}
