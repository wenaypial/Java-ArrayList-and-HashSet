import java.util.Scanner;
    public class Main {
    public static void main(String[] args){
        String favFruits[] = {"Mango", "Grapes", "Jackfruit", "Watermelon", "Banana"};
        Scanner Scan = new Scanner(System.in);
        System.out.println("    Annyeong chingu's, I am Rowena!");
        System.out.println("");
        System.out.println("Enter an Index of my favorite fruits: ");
        System.out.println("");
        System.out.println("=============");
        System.out.println(" 0 1 2 3 4 5");
        System.out.println("=============");
        int choice = Scan.nextInt();
        

        try{
            if(choice < 0){
                Scan.close();
                throw new fruitsException("The Index is negative!");
            }if(choice > 5){
                Scan.close();
                throw new fruitsException("The index "+ choice +" is not valid!");
            }
            System.out.println("Great!I love " + favFruits[choice]);
        }catch(fruitsException e){
            System.out.println(e.getMessage());
        }
        Scan.close();
    }
}
