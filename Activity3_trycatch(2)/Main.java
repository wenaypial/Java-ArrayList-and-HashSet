import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Desserts> listOfDesserts = new ArrayList<Desserts>();

        System.out.println("Welcome to sweetness overload where desserts are served!");
        System.out.println("Note: Only input an integer.");

        try{
            System.out.print("Number of desserts you want: ");
            Integer objects = input.nextInt();
            
            if(objects < 0){
                input.close();
                sc.close();
                throw new DessertsException("Your input is negative. Please input positive index.");
            }

            for(int i = 0; i < objects; i++){
                
                System.out.println("");
                System.out.print("desserts name: ");
                String Desserts_sc = sc.nextLine();

                System.out.print("Pieces: ");
                int Pieces_sc = Integer.parseInt(sc.nextLine());
    
                listOfDesserts.add(new Desserts(Desserts_sc, Pieces_sc));
            }

            System.out.println("");
            System.out.println("Here is/are your dessert/s!");
            System.out.println("=====================================");
            for(Desserts list : listOfDesserts){
                System.out.println("Desserts name: " + list.getDessertsName() + " || " + "Pieces: " + list.getPieces());    
            }
            System.out.println("=====================================");
            System.out.println("");

            input.close();
            sc.close();

        }
        catch(DessertsException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Your input is not a number.");
        }

    }
}
