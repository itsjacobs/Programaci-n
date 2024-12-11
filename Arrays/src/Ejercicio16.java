import java.io.IOException;

public class Ejercicio16 {
    public static void main(String[] args) throws IOException {
        char[]palindromo=new char[10];
        int n=-1;
        boolean flag=true;

        System.out.println("Escribe una palabra");
        for (int i=0;i< palindromo.length;i++){
            palindromo[i]=(char) System.in.read();
            n++;
            if (palindromo[i]==10){
                i=palindromo.length;
            }
        }

        for (int i = 0, j = n-1; i< n/2&&flag; i++, j--){
            if (palindromo[i]!=palindromo[j]){
                flag=false;
            }
        }

        System.out.print("La palabra ");
        for (int i=0;i< n;i++){
            System.out.print(palindromo[i]);
        }
        if (flag){
            System.out.println(" es un palindromo");
        } else {
            System.out.println(" no es un palindromo");
        }
    }
}
