package com.stackroute.moviecruiserapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.moviecruiserapp.domain.Movie;
import com.stackroute.moviecruiserapp.service.MovieService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/movie-api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class MovieController {
	
	Logger logger=LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
	MovieService movieService;
	
	 @GetMapping(value="/movie")
	 @ApiOperation(value="Returns all the movies from DB",
	  notes="Provided to retrieve all favorite movies",
	  response=Movie.class)
	public ResponseEntity<?> getAllMovies()
	{
		logger.trace("Enterered Controller getAllMovies() method");
		List<Movie> movieList=movieService.getAllMovies();
		ResponseEntity responseEntity=new ResponseEntity<List<Movie>>(movieList,HttpStatus.OK);
		return responseEntity;
		
	}
	  @PostMapping(value="/movie")
	  @ApiOperation(value="Posts the movie to DB",
	  notes="Provided to save all favorite movies",
	  response=Movie.class)
	 public ResponseEntity<?> postMovie(@RequestBody Movie movie)
	 {
		 Movie savedMovie = movieService.addMovie(movie);
		 ResponseEntity responseEntity = new ResponseEntity<Movie>(savedMovie, HttpStatus.CREATED);
		 
		 return responseEntity;
	 }
	 
	 @DeleteMapping(value="/movie/{id}")
	 @ApiOperation(value="Delete favorite movies from DB based on key",
	  notes="Provided to  delete  favorite movies from DB by key")
	 public ResponseEntity<?> deleateMovie(@PathVariable Long id)
	 {
		movieService.deleteMovie(id); 
		return ResponseEntity.noContent().build();
	 }
	 
	 
	 @PutMapping(value="/movie/{id}")
	 @ApiOperation(value="Update favorite movies in DB based on key",
	  notes="Provided to  update  favorite movies from DB by key",
	  response=Movie.class)
	 public ResponseEntity<?> updateMovie(@PathVariable(value="id") Long id ,@RequestBody Movie comments)
	 {
		 System.out.println("entered Controller method");
		 Movie savedMovie=movieService.updateMovie(comments, id) ;
		 ResponseEntity  responseEntity = new ResponseEntity<Movie>(savedMovie, HttpStatus.OK);
		  return responseEntity;
	 }
	 

	 
	 
}
