public class DessertsException extends Exception {

    public DessertsException(String message){
        super(message);
    }
    
    public String notNumber(){
        return "Your input is not a number.";
    }

}