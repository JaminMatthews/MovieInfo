package main.java;

/**
* The MovieInfo program will search a given movie database and return matching results for a given movie title.
* There are two databases it can connect to: the Open Movie Database (OMDb) and The Movie Database (TMDb).
* It will search the specified database for all titles matching the given movie, then print the title and year of each to the console.
* 
* Usage: java -Dapi=OMDb -Dmovie="Jack Reacher" -jar movie-info-1.0.0.jar 
* 
* @author  Ben Matthews
* @version 1.0.0
* @since   2018-10-05
*/
public class Main {
	/**
     * This is the main method for the MovieInfo program
     * @param -Dapi the target website API
     * @param -Dmovie the movie to search for
     * @return will print results to console
     */
    public static void main(String[] args) { 
    	//read args
    	String api = System.getProperty("api");
    	String title = System.getProperty("movie");
    	
    	//initialise the appropriate data source
    	Source dataSource;
    	if((api != null) && api.equals("OMDb")) {
    		dataSource = new OMDbSource();
    	} else if((api != null) && api.equals("TMDb")) {
    		dataSource = new TMDbSource();
    	} else { //if no api set then stop
    		System.out.println("Error no valid api set - use OMDb or TMDb");
    		System.out.println("Usage example: java -jar movie-info-1.0.0.jar -Dapi=OMDb -Dmovie=\"Indiana Jones\"");
    		return;
    	}
    	
    	// check title
    	if((title == null) || (title == "")) {
    		System.out.println("Error no movie set");
    		System.out.println("Usage example: java -jar movie-info-1.0.0.jar -Dapi=OMDb -Dmovie=\"Indiana Jones\"");
    		return;
    	}
    	
    	//get information for given movie title
    	int count = dataSource.searchTitle(title);
    	
    	//print information if found
    	if(count > 0) {
    		System.out.println("Movies found:");
    		System.out.println(dataSource.getResults());
    	} else if (count == 0) {
    		System.out.println("No results found for movie title: " + title);
    	} else {
    		System.out.println("Error searching movie title: " + title);
    	}
    }
}
