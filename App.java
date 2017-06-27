import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    CD gaga = new CD("Lady Gaga", "Joanne", 2017, 9);
    CD gwen = new CD("Gwen Stefani", "LAMB", 2006, 6);
    CD chance = new CD("Chance the Rapper", "Coloring Book", 2016, 3);
    CD nat = new CD("Nat King Cole", "The Unforgettable", 1960, 9);
    CD prince = new CD("Prince", "Parade", 1986, 12);
    CD taylor1 = new CD("Taylor Swift", "1989", 2014, 10);
    CD taylor2 = new CD("Taylor Swift", "Red", 2012, 8);

    CD[] inventory = {gaga, gwen, chance};


    System.out.println("Welcome to Emilie's CD Store.");
    System.out.println("Would you like to: View Inventory, Search by Year, Search by Price, Search by Artist, or Quit");
    String navigationChoice = myConsole.readLine();

    if (navigationChoice.equals("View Inventory")) {
      for (CD ep : inventory ) {
        System.out.println("---------------");
        System.out.println( ep.mArtistName );
        System.out.println( ep.mAlbumName );
        System.out.println( ep.mReleaseYear );
        System.out.println( ep.mPrice );
      }
    } else if (navigationChoice.equals("Search by Price")) {
        System.out.println("What is the maximum price you would pay?");
        Integer userMaxPrice = Integer.parseInt(myConsole.readLine());
    } else if (navigationChoice.equals("Search by Year")) {
        System.out.println("Logic not yet built");
    } else if (navigationChoice.equals("Search by Artist")) {
        System.out.println("Logic not yet built");
    } else {
        System.out.println("Logic not yet built");
    }

  }
}
