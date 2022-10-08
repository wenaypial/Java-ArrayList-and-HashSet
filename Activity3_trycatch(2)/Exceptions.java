public class Exceptions extends Exception{
    public Exceptions(String message){
        super(message);
    }
    public String outofBound(){
        return "Negative variable";
    }
    public String negativeIndex(){
        return "Invalid";
    }
}