The MovieInfo program will search a given movie database and return matching results for a given movie title.
There are two databases it can connect to:
the Open Movie Database (OMDb) - http://www.omdbapi.com/
The Movie Database (TMDb) - https://www.themoviedb.org/
It will search the specified database for all titles matching the given movie, then print the title and year of each to the console.

Example Usage: 

java -Dapi=OMDb -Dmovie="Jack Reacher" -jar movie-info-1.0.0.jar 

java -Dapi=TMDb -Dmovie="Indiana Jones" -jar movie-info-1.0.0.jar 
