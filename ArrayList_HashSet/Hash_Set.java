import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hash_Set {

    public static void main(String[] args) {
        HashSet<String> favorites = new HashSet<String>();

       
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your favorite travel destination?");
        String travel= sc.nextLine();
        System.out.println("What is your favorite song?");
        String song = sc.nextLine();
        System.out.println("What is your favorite season?");
        String season = sc.nextLine();
        System.out.println("What is your favorite motto in life?");
        String motto = sc.nextLine();

        favorites.add(name);
        favorites.add(travel);
        favorites.add(song);
        favorites.add(season);
        favorites.add(motto);
    
        Iterator it =  favorites.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
