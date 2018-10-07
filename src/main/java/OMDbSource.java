package main.java;

/**
 * class representing the OMDb website with an API that returns movie information
 */
public class OMDbSource extends Source {
	
	//constructor for OMDb class
	public OMDbSource() {
		baseURL = "http://www.omdbapi.com/?apikey=91050e3d";
	}
	
	// Sends a rest request for the given movie title
	// returns number of titles found, or -1 if an error occurred
	public int searchTitle(String title) {
		//format request
		String URL = baseURL;
		URL += "&s=" + title;
		URL += "&r=" + "json";
		
		//attempt to search and return number of movies found
		try {
			movies = restTemplate.getForObject(URL, OMDbMovieList.class);
			return movies.getNumberOfMovies();
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		return -1;
	}
}
