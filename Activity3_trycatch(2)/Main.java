import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Desserts> desserts = new ArrayList<Desserts>();
        System.out.println("=====================================");
        System.out.println("Annyeong!, wanna buy some desserts?");
        System.out.println("=====================================");
        System.out.print("How many desserts you want to buy?:");
        int NumObj = scan.nextInt();
        scan.nextLine();
                try{
                        if(NumObj > 0 ){
                            
                            for(int i = 0;i<NumObj; i++){
                                System.out.print("Please enter the desserts you want to buy "+ "(" + i + ") :");
                                String name = scan.nextLine();
                                desserts.add(new Desserts(name));
                            }
                            System.out.println("");
                            System.out.println("Here are the desserts!");
                            System.out.println("================");
                            for(int j = 0;j<NumObj; j++){
                                System.out.println(desserts.get(j).getName());
                                
                            }
                            System.out.println("================");
                            System.out.println("");
                            System.out.println("Kamsahamnida!, Please Come Again..");
                        }else if(NumObj == 0){
                            scan.close();
                            throw new Exceptions("Zero is invalid");
                        }else{
                            scan.close();
                            throw new Exceptions("Negative Variable is not allowed");
                        }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
    } 
}
