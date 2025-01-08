import java.util.Scanner;

public class Exm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        char z = 'A';

        for (x = 0; x <= 9; x++){
            for (y = 0; y <= 9; y++) {
                for ( z = 'A'; z <= 'Z'; z++) {
                    System.out.println(x + "" + y + z);
                }
            }
        }
    }
}
