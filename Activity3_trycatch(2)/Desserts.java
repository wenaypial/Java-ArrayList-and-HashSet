public class Desserts{
    private String desserts;
    private int pieces;
    
      public Desserts(String desserts, int pieces) {
        this.desserts = desserts;
        this.pieces = pieces;
    }

    public String getDessertsName() {
        return desserts;
    }

    public int getPieces(){
        return pieces;
    }
}