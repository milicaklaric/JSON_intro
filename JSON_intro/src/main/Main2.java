package main;

import java.io.FileReader;
import com.google.gson.Gson;

import movie.Movie;

/**
 * Main klasa za deserijalizaciju JSON fajla
 * @author MK
 *
 */
public class Main2 {

	public static void main(String[] args) {
		
		try(FileReader file = new FileReader("movie.json")){
			Gson gson = new Gson();
			Movie m = gson.fromJson(file, Movie.class);
		
			System.out.println(m);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
