package main.java;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Movie class representing information about a movie returned by the OMDb
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OMDbMovie extends Movie{
	
	//constructor
	public OMDbMovie() {
	}
	
	@JsonProperty("Title")
	public String getTitle() {
		return title;
	}
	
	@JsonProperty("Title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	@JsonProperty("Year")
	public String getYear() {
		return year;
	}
	
	@JsonProperty("Year")
	public void setYear(String year) {
		this.year = year;
	}
}
