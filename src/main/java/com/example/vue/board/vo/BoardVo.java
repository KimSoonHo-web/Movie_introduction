package com.example.vue.board.vo;

public class BoardVo {
    private int id; // 고유 ID
    private String title; // 영화 제목
    private String overview; // 영화 개요
    private String posterPath; // 포스터 이미지 경로
    private int releaseDate; // 영화 개봉 날짜
    private String country; // 제작 국가
    private float rating; // 영화 평점 (5점 만점)

    public BoardVo() {
        // 기본 생성자
    }

    public BoardVo(int id, String title, String overview, String posterPath, int releaseDate, String country, float rating) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.posterPath = posterPath;
        this.releaseDate = releaseDate;
        this.country = country;
        this.rating = rating;
    }

    // 게터와 세터
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "BoardVo [id=" + id + ", title=" + title + ", overview=" + overview + ", posterPath=" + posterPath + 
               ", releaseDate=" + releaseDate + ", country=" + country + ", rating=" + rating + "]";
    }
}
