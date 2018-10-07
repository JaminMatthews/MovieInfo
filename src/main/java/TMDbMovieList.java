package main.java;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MovieList class representing a list of movies returned by TMDb
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TMDbMovieList extends MovieList{
	private List<TMDbMovie> movieList;
	private int totalResults;
	
	//constructor
	public TMDbMovieList() {
		movieList = new ArrayList<TMDbMovie>();
		totalResults = 0;
	}
	
	//calls toString on all movies in the list and returns result as a string
	public String toString() {
		String str = "";
		for(TMDbMovie movie: movieList) {
			str += movie.toString() + "\n";
		}
		return str;
	}
	
	//returns the list as a list of generic movies
	public List<? extends Movie> getMovieList() {
		return movieList;
	}
	
	@JsonProperty("results")
	public List<TMDbMovie> getResults() {
		return movieList;
	}
	
	@JsonProperty("results")
	public void setResults(List<TMDbMovie> movieList) {
		this.movieList = movieList;
	}
	
	@JsonProperty("total_results")
	public int getTotalResults() {
		return totalResults;
	}
	
	@JsonProperty("total_results")
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
}
