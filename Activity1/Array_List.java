import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args){
        ArrayList<String> favorites = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?" );
        String name = sc.nextLine();
        System.out.println("What is your favorite travel destination?");
        String travel = sc.nextLine();
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
        
        System.out.println(favorites);    
        
         }
}

