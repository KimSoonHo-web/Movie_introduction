package com.example.vue.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.vue.movie.model.MovieService;
import com.example.vue.movie.vo.MovieVo;

@RestController
@RequestMapping("/api")
public class MovieController {

	@Autowired
	private MovieService movieService;

	// 모든 영화 데이터를 가져오는 메서드
	@GetMapping("/movies")
	public List<MovieVo> getAllMovies() {
		List<MovieVo> movies = movieService.getAllMovies();
		//System.out.println("Retrieved movies: " + movies);
		return movies;
	}

	// 영화 데이터 및 이미지 파일 업로드 처리 메서드
//  @PostMapping("/submit-movie")
//  public MovieVo submitMovie(MovieVo FormData) throws IOException {
//  	
//  	System.out.println("FormData : " + FormData);
//  	
//  	MovieVo movie =  movieService.setUpload(FormData);
//
//    return movie;
//  }

	// 영화 데이터 및 이미지 파일 업로드 처리 메서드
	@PostMapping("/submit-movie")
	public ResponseEntity<MovieVo> submitMovie(@RequestParam("title") String title,
			@RequestParam("overview") String overview, @RequestParam("releaseDate") int releaseDate,
			@RequestParam("country") String country, @RequestParam("rating") float rating,
			@RequestParam("imageFile") MultipartFile imageFile) {
		

//		System.out.println("title : " + title);
//		System.out.println("overview : " + overview);
//		System.out.println("releaseDate : " + releaseDate);
//		System.out.println("country : " + country);
//		System.out.println("rating : " + rating);
//		System.out.println("imageFile : " + imageFile);

		MovieVo movie = new MovieVo();
		movie.setTitle(title);
		movie.setOverview(overview);
		movie.setReleaseDate(releaseDate);
		movie.setCountry(country);
		movie.setRating(rating);

		try {
			MovieVo uploadedMovie = movieService.setUpload(movie, imageFile);

			return ResponseEntity.ok(uploadedMovie);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// 삭제
	@GetMapping("/delete-movie")
	public ResponseEntity<?> deleteMovie(@RequestParam("movieId") Long id) {

		// 영화 삭제 로직 구현
		try {
			movieService.deleteMovieById(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting movie");
		}
	}

	// 영화 수정
	@PostMapping("/movieUpdate")
	public int updateMovie(@RequestBody MovieVo movieDetails) {

		System.out.println("movieDetails : " + movieDetails);

		 int updatedMovie = movieService.updateMovie(movieDetails);
		 System.out.println("updatedMovie : " + updatedMovie);
		return updatedMovie;

	}
}