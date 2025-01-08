import java.io.IOException;
import java.util.Scanner;

public class Ejer1 {
    public static void perfecto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num%i == 0){
                suma += i;
            }
        }
        if (suma == num){
            System.out.println("El numero es perfecto");
        }
        else{
            System.out.println("El numero no es perfecto");
        }
        sc.close();
    }
    public static void abundante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num%i == 0){
                suma += i;
            }
        }
        if (suma>num){
            System.out.println("El numero es abundante");
        }
        else{
            System.out.println("El numero no es abundante");
        }
        sc.close();
    }
    public static void defectuoso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num%i == 0){
                suma += i;
            }
        }
        if (suma>(num*2)){
            System.out.println("El numero es defectuoso");
        }
        else{
            System.out.println("El numero no es defectuoso");
        }
        sc.close();
    }
    public static void odioso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int contador = 1;
        for (;num>=2;) {
            if (num%2 == 1){
                contador++;
            }
            num = num/2;
        }
        if (contador%2 == 1){
            System.out.println("El numero es odioso");
        }
        else {
            System.out.println("El numero no es odioso");
        }
    }
    public static void primo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        boolean primo = true;
        for (int i = 2; i <= num/2; i++) {
            if (num%i ==0){
                    primo = false;
            }
        }
        if (primo == false){
            System.out.println("NO es primo");
        }
        else if (primo == true){
            System.out.println("Es primo");
        }
        sc.close();
    }
    public static void amigos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1%i == 0){
                suma1 += i;
            }
        }
        for (int i = 1; i <= num2; i++) {
            if (num2%i == 0){
                suma2 += i;
            }
        }
        if (suma1 == num2 && suma2 ==num1){
            System.out.println("los numeros son amigos");
        }
        else{
            System.out.println("Los numeros no son amigos");
        }
        sc.close();
    }
    public static void enemigos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int contador = 1;
        for (;num>=2;) {
            if (num%2 == 1){
                contador++;
            }
            num = num/2;
        }
        if (contador%2 == 0){
            System.out.println("El numero es enemigo");
        }
        else {
            System.out.println("El numero no es enemigo");
        }
    }
    public static void piramide() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de filas que tiene la piramide");
        int num = sc.nextInt();
        char a = '*';
        for (int i = 1; i<=num;i++){
            for (int j = 1; j<=i;j++ ){
                System.out.print(a);
                if (a == '*'){
                    a = '+';
                }
                else if(a == '+'){
                    a = '-';
                }
                else if (a =='-'){
                    a = '*';
                }
            }
            System.out.println();
            a = '*';
        }
        sc.close();
    }
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una opcion:\n 1.perfecto \n 2.abundante\n 3.defectuoso\n 4.primo\n 5.amigos\n 6.odioso\n 7. enemigo\n 8.piramide\n");
        return sc.nextInt();
    }
    public static void selector() throws IOException {
        Scanner sc = new Scanner(System.in);
        switch (menu()){
            case 1:
                perfecto();
                    break;
            case 2:
                abundante();
                    break;
            case 3:
                defectuoso();
                    break;
            case 4:
                primo();
                    break;
            case 5:
              amigos();
                    break;
            case 6:
                odioso();
                    break;
            case 7:
                enemigos();
                    break;
            case 8:
                piramide();
                    break;
        }
    }
    public static void main(String[] args) throws IOException {
        selector();
    }
}
