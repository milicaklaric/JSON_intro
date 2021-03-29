package main;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import movie.Movie;

/**
 * Main klasa za serijalizaciju JSON fajla
 * 
 * @author MK
 *
 */
public class Main1 {

	public static void main(String[] args) {
		Movie m = new Movie();

		m.setImdbId("tt0016367");
		m.setTitle("From dusk till dawn");
		m.setReleaseYear(1996);
		m.setRating(7.2);
		String[] actors = { "George Clooney", "Quentin Tarantino" };
		m.setActors(actors);

		try (FileWriter file = new FileWriter("movie.json")) { // try with resources automatski zatvara fajl kad se
																// zavrsi blok cak i ako se baci neki izuzetak
			// Gson gson = new Gson(); - obicna inicijalizacija, nije pregledan fajl
			Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create(); // ubacune i znakove za kraj
																							// reda, pregledniji ispis
			// serializeNulls - u JSON fajl ce dodati i one koji su null (inace se
			// izostavlja)
			/*
			 * String json = gson.toJson(m); file.write(json);
			 */

			gson.toJson(m, file); // krace

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
