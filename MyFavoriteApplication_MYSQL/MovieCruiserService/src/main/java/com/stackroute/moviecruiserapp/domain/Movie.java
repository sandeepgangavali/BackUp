package com.stackroute.moviecruiserapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Movie")
@ApiModel(description="Details about the movie")
public class Movie {

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes="Primary key for movie identification")
	private Long id;
    
	@ApiModelProperty(notes="Title of the movie")
	private String title;
     
	@ApiModelProperty(notes="overview of the movie")
	private String overview;
	
	@ApiModelProperty(notes="Rating")
	private Integer vote_average;
    
	@ApiModelProperty(notes="Image path")
	private String poster_path;
    
	@ApiModelProperty(notes="User Comments")
	private String comments;

	public Movie(Long id, String title, String overview, Integer vote_average, String poster_path, String comments) {
		super();
		this.id = id;
		this.title = title;
		this.overview = overview;
		this.vote_average = vote_average;
		this.poster_path = poster_path;
		this.comments = comments;
	}
	

	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Integer getVote_average() {
		return vote_average;
	}

	public void setVote_average(Integer vote_average) {
		this.vote_average = vote_average;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
