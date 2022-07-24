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
        String s = "Hello World!";
        System.out.println(s + " ");

        for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }
            //System.out.println(i);
        }
        
        int k = dostuff(10);
        //System.out.println(k);

        //System.out.println(doString("Hello"));
        
        Board b = new Board();
        b.setBoardDim(5,5);
        int[] d = b.getBoardDim();
        int[] p = {5,5};
        boolean check = b.isLegal(p);
        
        b.initBoard();
        
    }   

}
