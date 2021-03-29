package main;

import java.io.FileReader;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Main6 {

	public static void main(String[] args) {
		try (FileReader file = new FileReader("movie_manual.json")) {
			Gson gson = new Gson();
			
			JsonObject m = gson.fromJson(file, JsonObject.class);
			
			//System.out.println(m.toString());
			System.out.println(m.get("imdbId").getAsString());
			System.out.println(m.get("title").getAsString());
			System.out.println(m.get("releaseYear").getAsInt());
			System.out.println(m.get("rating").getAsDouble()-1);
			
			JsonArray actors = m.getAsJsonArray("actors");
			System.out.println(actors.get(1).getAsString());
			
			//kad zelimo da vidimo strukturu JSON elementa ako nam nije vec poznata
			Set<Entry<String, JsonElement>> es = m.entrySet();
			for (Entry<String, JsonElement> element : es) {
				System.out.println(element);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
