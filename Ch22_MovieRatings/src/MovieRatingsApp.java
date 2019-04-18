import java.util.ArrayList;
import java.util.List;

import util.Console;

public class MovieRatingsApp {

	public static void main(String[] args) {

		MovieCollection movies = new MovieCollection();
		// add some starting data to make testing easier

		movies.add(new Movie("Wonder Woman", 2017, 4.1));
		movies.add(new Movie("Clash of the Titans", 2010, 2.6));
		movies.add(new Movie("Citizen Kane", 1941, 4.9));

		System.out.println("Welcome to the Movie Ratings application!\n");
		
		// perform 1 or more actions
		int choice = 0;

		while (choice != 6) {
			displayMenu();
			choice = Console.getInt("Choose a menu option: ", 0, 7);
			Console.println();

			List<Movie> filteredMovies = new ArrayList<>();
			if(choice==1) {
				int quantity= Console.getInt("How many movies do you want to enter? ");
				for(int i=1;i<=quantity;i++) {
					System.out.println();
					System.out.println("Movie #"+i);
					System.out.println("==========");
					String title=Console.getString("Enter title: ");
					int year=Console.getInt("Enter year: ");
					double rating=Console.getDouble("Enter rating between 1 and 5 (decimals OK): ");
					Movie  m= new Movie(title,year,rating);
					movies.add(m);
					
				}
			}
			if(choice==2) {
				System.out.println("Movies rated 4.0 or higher" );
				System.out.println("--------------------------");
				//double hRate=movies.getHighestRating();
				//System.out.println(hRate);
				filteredMovies = movies.getMovies(c -> c.getRating()>=4.0);
        		displayMovies(filteredMovies);
				
			}
			if(choice==3) {
				System.out.println("Movies within a year of 2010 and up");
				filteredMovies=movies.getMovies(c-> c.getYear()>=2010);
				displayMovies(filteredMovies);
			}
			if(choice==4) {
				System.out.println("List of all movies: ");
				filteredMovies=movies.getMovies();
				displayMovies(movies.getMovies());
			}
			if(choice==5) {
				System.out.println("Movies Rating Data: ");
				System.out.println("--------------------");
				Console.println("Number of Movies: "+movies.getSize());
				Console.println("Lowest Rating: "+movies.getLowestRating());
				Console.println("Highest Rating "+movies.getHighestRating());
				Console.println("Average Rating: "+movies.getAverageRating());
				
			}
			if(choice==6) {
				System.out.println("Good Bye!");
			}
			

		}
	}

	private static void displayMovies(List<Movie> filteredMovies) {
		if (filteredMovies.isEmpty()) {
            Console.println("No movies for this choice.");
        } else {
            filteredMovies.stream().map(Movie::toString).forEach(Console::println);
        }
		
	}

	public static void displayMenu() {
		System.out.println("----------------------");
		System.out.println("What do you want to do?");
		System.out.println("----------------------");
		System.out.println("1 - Enter a movie");
		System.out.println("2 - View top rated movies");
		System.out.println("3 - View most recent movies");
		System.out.println("4 - View all movies");
		System.out.println("5 - View ratings");
		System.out.println("6 - Quit application");
	}

}
