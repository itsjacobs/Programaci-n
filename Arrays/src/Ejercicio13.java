import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean flag = true;
        int n;
        int[] hex=new int[4];
        char[]ch=new char[4];
        do {
            System.out.println("Introduce un número para pasarlo a hexadecimal");
            n = teclado.nextInt();
            if ((n >= 0) && (n <= 32000))
                flag = false;
            else
                System.out.println("Tiene que ser un número entre 0 y 32000");
        } while (flag);

        for (int i = 3; i >= 0; i--) {
            if (n>15){
                hex[i]=(n%16);
                n=n/16;
            } else{
                hex[i]=n;
                i=-1;
            }
        }

        for (int i = 0; i < hex.length; i++) {
            if (hex[i]<10)
                ch[i]=(char)(hex[i]+48);
            else
                ch[i]=(char)(hex[i]+55);

        }

        for (int i = 0; i < hex.length; i++) {
            if (hex[i]!=0)
                flag=true;
            if (flag)
                System.out.print(ch[i]);
        }
        if (n==0){
            System.out.print(n);
        }
    }
}



