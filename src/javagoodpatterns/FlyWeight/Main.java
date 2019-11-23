package javagoodpatterns.FlyWeight;

public class Main {

    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPawn("Edward" , "3" , "4" , "black");
        ChessPiece blackQueen = new BlackQueen("Edward" , "3" , "4" , "black");

        System.out.println(blackPawn.getColor()==blackQueen.getColor());
    }
}
