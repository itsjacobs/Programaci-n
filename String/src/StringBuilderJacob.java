import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuilderJacob {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero");
        String entradanumero = lector.readLine();
        StringBuilder sb = new StringBuilder(entradanumero);
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            System.out.println(sb.toString());
        }
    }
}
