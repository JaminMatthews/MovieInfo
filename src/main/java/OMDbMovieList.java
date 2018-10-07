package main.java;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MovieList class representing a list of movies returned by OMDb
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OMDbMovieList extends MovieList{
	private List<OMDbMovie> movieList;
	private int totalResults;
	private String response;
	
	//constructor
	public OMDbMovieList() {
		movieList = new ArrayList<OMDbMovie>();
		totalResults = 0;
		response = "";
	}
	
	//calls toString on all movies in the list and returns result as a string
	public String toString() {
		String str = "";
		for(OMDbMovie movie: movieList) {
			str += movie.toString() + "\n";
		}
		return str;
	}
	
	//returns the list as a list of generic movies
	public List<? extends Movie> getMovieList() {
		return movieList;
	}
	
	@JsonProperty("Search")
	public List<OMDbMovie> getResults() {
		return movieList;
	}
	
	@JsonProperty("Search")
	public void setResults(List<OMDbMovie> movieList) {
		this.movieList = movieList;
	}
	
	@JsonProperty("totalResults")
	public int getTotalResults() {
		return totalResults;
	}
	
	@JsonProperty("totalResults")
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	
	@JsonProperty("Response")
	public String getResponse() {
		return response;
	}
	
	@JsonProperty("Response")
	public void setResponse(String response) {
		this.response = response;
	}
	

}
