package main.java;

/**
 * class representing the TMDb website with an API that returns movie information
 */
public class TMDbSource extends Source {
	
	//constructor for OMDb class
	public TMDbSource() {
		baseURL = "https://api.themoviedb.org/3/search/movie?api_key=f05a4dec9234826f9d10e62633c2dc55";
	}
	
	// Sends a rest request for the given movie title
	// returns number of titles found, or -1 if an error occurred
	public int searchTitle(String title) {
		//format request
		String URL = baseURL;
		URL += "&query=" + title;
		
		//attempt to search and return number of movies found
		try {
			movies = restTemplate.getForObject(URL, TMDbMovieList.class);
			return movies.getNumberOfMovies();
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		return -1;
	}
}
