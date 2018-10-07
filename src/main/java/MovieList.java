package main.java;

import java.util.List;

/**
 * abstract MovieList class representing a list of movies
 */
public abstract class MovieList {
	
	//calls toString on all movies in the list and returns result as a string
	public String toString() {
		List<? extends Movie> movies = this.getMovieList();
		String str = "";
		for(Movie mov: movies) {
			str += mov.toString() + "\n";
		}
		return str;
	}
	
	//returns size of the list
	public int getNumberOfMovies() {
		return getMovieList().size();
	}
	
	//returns the list as a list of generic movies
	public abstract List<? extends Movie> getMovieList();
}
