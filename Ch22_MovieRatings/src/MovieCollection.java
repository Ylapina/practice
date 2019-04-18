import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {
	 List<Movie> movieList;
	 
	 public List<Movie> getMovies() {
			return movieList;
		}

		public void setMovies(List<Movie> movies) {
			this.movieList = movies;
		}
		// Create a MovieCollection with no movies
		public MovieCollection() {
			movieList = new ArrayList<>();
		}

		// Create a MovieCollection with list of movies
		public MovieCollection(List<Movie> movies) {
			movies = new ArrayList<>();
			this.movieList = movies;
		}

		// Create a MovieCollection with 1 movie
		public MovieCollection(Movie m) {
			movieList = new ArrayList<>();
			movieList.add(m);
		}
		
		
	public void add(Movie m ){
		movieList.add(m);
	}

	public List<Movie> getMovies(Predicate<Movie> condition) {
		List<Movie> movies = new ArrayList<>();
		for (Movie m : movieList) {
			if (condition.test(m)) {
				movies.add(m);
			}
		}
		return movies;
	}

	public List<Movie> filterMovies(List<Movie> movies, TestMovie condition) {
		List<Movie> filteredMovies = new ArrayList<>();
		for (Movie m : movies) {
			if (condition.test(m)) {
				filteredMovies.add(m);
			}
		}
		return filteredMovies;
	}

	public double getLowestRating() {
		//for(Movie m:movies)
		//lr=Math.min(lr,m.getRating());
		//or second option lr=movies.stream()
		//.map(movie::getRating)
		//.reduce(5.0,Math::min);
		double lRate = movieList.stream()
				.map(r -> r.getRating()).reduce(5.0, (a, b) -> Math.min(a, b));
		return lRate;
	}

	public double getHighestRating() {
		double hRate = movieList.stream()
				.map(r -> r.getRating()).reduce(5.0, (a, b) -> Math.max(a, b));
		return hRate;
	}

	public double getAverageRating() {
		double summary = movieList.stream()
				.map(r -> r.getRating()).reduce(5.0, (a, b) -> (a + b));
		return summary / movieList.size();
	}

	public int getSize() {
		return movieList.size();
	}

	

}
