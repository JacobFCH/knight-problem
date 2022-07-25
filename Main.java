import utilities.Board;
import utilities.Knight;

public class Main {

    public static int dostuff(int j){
        return j / 2;
    }

    public static String doString(String s){
        return s + s;
    }

    public static void main(String[] args) {
        
        Board b = new Board();
        b.setBoardDim(5,5);
        int[] d = b.getBoardDim();
        int[] p = {5,5};
        b.initBoard();
        boolean check = b.isLegal(p);
        
        
        
        Knight knight = new Knight();
        knight.setPosition(2,2);
        int[] k_pos = knight.getPosition();
        int[][] new_ks = knight.generateNewKnightPositions();
        //System.out.println(4 % 4);
        
        
    }   

}
