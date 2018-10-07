package main.java;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Movie class representing information about a movie returned by the TMDb
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TMDbMovie extends Movie{
	
	//constructor
	public TMDbMovie() {
	}
	
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}
	
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	@JsonProperty("release_date")
	public String getYear() {
		return year;
	}
	
	@JsonProperty("release_date")
	public void setYear(String year) {
		this.year = year.substring(0, 4);
	}
}
