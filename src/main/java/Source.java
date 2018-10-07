package main.java;

import org.springframework.web.client.RestTemplate;

/**
 * abstract class representing a website with an API that returns movie information
 */
public abstract class Source {
	protected String baseURL;
	protected RestTemplate restTemplate;
	protected MovieList movies;
	
	//constructor for Source class
	public Source() {
		//initialise variables
		baseURL = "";
		restTemplate = new RestTemplate();
    }
	
	//returns the movies as a string
	public String getResults() {
		return movies.toString();
	}
	
	// Sends a rest request for the given movie title
	// returns number of titles found, or -1 if an error occurred
	public abstract int searchTitle(String title);
}
