

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        Character choice, clear;
        Scanner sc=new Scanner(System.in);
        
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
       
        while(true){
            
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
        
            switch(choice){
                case 'A':
                    System.out.println("Note: Input composite numbers only.");
                    System.out.println();
                    System.out.print("Input number you want to add: ");
                    int add = sc.nextInt();
                    System.out.println("");

                    int j = add/2;
                    int isPrime = 0;

                    if(add == 0 || add == 1){
                        System.out.print("Enter a key number you want to add: ");
                        int key = sc.nextInt();
                        System.out.println("");

                        hashmap.put(key, add);
                        System.out.println(key + "=>" + add + " is successfully added to the HashMap!");

                    }
                    else{
                        for(int i = 2; i <= j; i++){
                            if(add%i == 0){
                                System.out.print("Enter a key number you want to add: ");
                                int key = sc.nextInt();
                                System.out.println("");

                                hashmap.put(key, add);
                                System.out.println(key + "=>" + add + " is successfully added to the HashMap!");
                                isPrime = 1;
                                break;
                            }
                        }
                        if(isPrime == 0){
                            System.out.println("Invalid!. You input a prime number, try another!");
                        }
                    }

                    break;
                case 'B':
                    System.out.print("Input a key you want to remove: ");
                    int remove = sc.nextInt();
                    System.out.println("");

                    if(hashmap.containsKey(remove)){
                        System.out.println(remove + "=>" + hashmap.get(remove) + " is successfully removed!");
                        hashmap.remove(remove);
                    }

                    break;

                case 'C':

                    System.out.println("Displaying numbers");
                    System.out.println("****************************");

                    hashmap.entrySet().forEach(entry -> {
                        System.out.println(entry.getKey() + "=>" + entry.getValue());
                    });


                    System.out.println("****************************");

                    break;

                case 'D':

                            hashmap.clear();
                            System.out.println("****************************");
                            System.out.println("Contents all cleared!");
                            System.out.println("****************************");
                            break;
                case 'E':
                    sc.close();
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid! Please input the proper choice!");

    
            } 
	    }
	}
}








