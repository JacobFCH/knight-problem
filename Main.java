public class Main {
    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(s + " ");

        for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }

    }
}
