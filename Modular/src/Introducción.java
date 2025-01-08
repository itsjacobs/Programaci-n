import java.util.Scanner;

public class Introducción {
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    public static void restar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a-b);
    }
    public static void producto(int a, int b){
        System.out.println(a*b);
    }
    public static int division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 2 numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a/b;
    }
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una opcion:\n 1.sumar\n 2.restar\n 3.producto\n 4.división\n");
        return sc.nextInt();
    }
    public static void selector(){
        Scanner sc = new Scanner(System.in);
        switch (menu()) {
            case 1:
                System.out.println("Introduce 2 numeros");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(sumar(a,b));
                break;
            case 2:
                restar();
                break;
            case 3:
                System.out.println("Introduce 2 numeros");
                a = sc.nextInt();
                b = sc.nextInt();
                producto(a, b);
                break;
            case 4:
                System.out.println(division());
                break;
        }
    }
    public static void main(String[] args) {
        selector();
    }
}
