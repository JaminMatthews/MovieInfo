package main.java;

/**
 * Abstract class representing information about a movie
 */
public abstract class Movie {
	protected String title;
	protected String year;
	
	//constructor
	public Movie() {
		title = "Unknown";
		year = "Unknown";
	}
	
	//returns result as a string
	public String toString() {
		return title + " (" + year + ")";
	}
	
	public abstract	String getTitle();
	public abstract	void setTitle(String title);
	public abstract	String getYear();
	public abstract	void setYear(String year);
}
