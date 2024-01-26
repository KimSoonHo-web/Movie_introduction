package com.example.vue.movie.model;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.example.vue.movie.mapper.MovieMapper;
import com.example.vue.movie.vo.MovieVo;

@Service
public class MovieService {

	@Autowired
	MovieMapper movieMapper;
	@Value("${file.upload-dir}")
	String uploadDirectory;

	public List<MovieVo> getAllMovies() {
		return movieMapper.findAll();
	}

	@Transactional
	public MovieVo setUpload(MovieVo movie, MultipartFile imageFile) throws IOException, InterruptedException {
	    System.out.println("movie2 : " + movie);

	    // 이미지 파일이 null이 아니고 비어있지 않은지 확인
	    if (imageFile != null && !imageFile.isEmpty()) {
	        String originalFilename = imageFile.getOriginalFilename();
	        String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
	        String fileName = System.currentTimeMillis() + fileExtension; // 고유한 파일 이름 생성

	        // 이미지가 저장될 파일 경로 구성
	        File destinationFile = new File(uploadDirectory + File.separator + fileName);
	        
	        // 서버에 파일 저장
	        imageFile.transferTo(destinationFile);

	        // 영화 객체에 저장된 이미지의 경로 업데이트
	        movie.setPosterPath(fileName); // '/assets/'가 애플리케이션에서 접근 가능한 경로라고 가정
	        System.out.println("저장한 이미지: " + movie.getPosterPath());
	    }

	    // 데이터베이스에 영화 데이터 저장
	    movieMapper.insertMovie(movie);

	    Thread.sleep(1000); //1초 대기
	    
	    return movie;
	}



	
	//삭제
	public void deleteMovieById(Long id) {
		 movieMapper.deleteMovie(id);
		
	}
	
	// 수정
	public int updateMovie(MovieVo movieDetails) {
		return movieMapper.updateMovie(movieDetails);
	}

}
