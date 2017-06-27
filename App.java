import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    CD gaga = new CD("Lady Gaga", "Joanne", 2017, 9);
    CD gwen = new CD("Gwen Stefani", "LAMB", 2006, 6);
    CD chance = new CD("Chance the Rapper", "Coloring Book", 2016, 3);

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
    } else {
      System.out.println("Not yet coded");
    }

  }
}
