package movie;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class Movie {

	@SerializedName("id") //kako ce se prikazati u JSON fajlu, anotacija iz GSONa
	private String imdbId;
	
	private String title;
	
	@SerializedName("year")
	private int releaseYear;
	
	private transient double rating; //kljucna rec u javi, izostavice se ovaj atribut u JSON fajlu

	private String[] actors;


	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [imdbId=" + imdbId + ", title=" + title + ", releaseYear=" + releaseYear + ", rating=" + rating
				+ ", actors=" + Arrays.toString(actors) + "]";
	}

	

}
