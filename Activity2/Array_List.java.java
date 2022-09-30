import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<Integer>();

        int choice;

        while (true) {
            System.out.println("");
            System.out.println("Select Options");
            System.out.println("============================");
            System.out.print("A.) Add numbers\n");
            System.out.print("B.) Remove numbers\n");
            System.out.print("C.) Display numbers\n");
            System.out.print("D.) Clear numbers\n");
            System.out.print("E.) Exit\n");
            System.out.println("============================");
            System.out.print("Enter your choice: ");
            System.out.println("");

            choice = sc.next().charAt(0);

            System.out.println("");

            switch (choice) {
                case 'A':
                    System.out.println("Enter a number you want to add: ");
                    int add = sc.nextInt();
                    System.out.println("");

                    if (add > 0) {
                        num.add(add);

                        System.out.println("Number " + add + " is successfully added to the ArrayList!");
                        break;
                    } else {
                        System.out.println("You input a negative number! Try another.");
                        break;
                    }

                case 'B':
                    System.out.println("Enter a number you want to remove: ");
                    int remove = sc.nextInt();
                    System.out.println("");

                    if (num.contains(remove)) {
                        num.remove(Integer.valueOf(remove));
                        System.out.println("Number " + remove + " is successfully removed!");
                        break;
                    }

                case 'C':
                    System.out.println("Displaying numbers in ArrayList");
                    System.out.println("");
                    System.out.println("****************************");
                    System.out.println(num);
                    System.out.println("****************************");
                    break;

                case 'D':
                    num.clear();
                    System.out.println("****************************");
                    System.out.println("Contents are all cleared!");
                    System.out.println("****************************");

                    // case 'n':
                    // System.out.println("ArrayList not cleared!");
                    break;

                case 'E':
                    sc.close();
                    System.out.println("Thank you very much!");
                    System.exit(0);
                    
                default:
                    System.out.println("The input is invalid! Please input the correct choice.");

                    Iterator<Integer> it = num.iterator();
                    System.out.println(it.next());
            }
        }
    }
}

