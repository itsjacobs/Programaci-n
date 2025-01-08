import java.io.IOException;
import java.util.Scanner;

public class Exm1 {
    public static void main(String[] args) throws IOException {

        int menu;
        Scanner lector = new Scanner(System.in);
        StringBuilder SB = new StringBuilder();

        do {
            System.out.println("Menu Opciones:\n" +
                    "1. Mostrar número deficientes del 1 al 100\n" +
                    "2. Contar vocales\n" +
                    "3. mostrar orden ejecución ejercicios y repeticiones\n" +
                    "4. Resetear secuencia de opciones\n" +
                    "5. Salir\n");
            menu = lector.nextInt();

            switch (menu){
                case 1:{
                    SB.append(menu);
                    int totalDiv;
                          // c=12
                    for (int c=1  ; c <=100 ; c++){
                        totalDiv=0;
                                    // c= 12/2 = 6
                        for (int i=1; i <= c/2; i++){
                            if (c%i==0 && c!=i){
                                totalDiv= totalDiv+i;
                            }
                        }
                        if (totalDiv<c){
                            System.out.println("El "+c+" es Deficiente");
                        }
                    }
                }
                break;
                case 2:{
                    SB.append(menu);
                    System.out.println("Introduce una frase para contar sus vocales");
                    char frase;
                    int contadorVocales=0;
                    int contadorA=0;
                    int contadorE=0;
                    int contadorI=0;
                    int contadorO=0;
                    int contadorU=0;
                    do {
                        frase= (char) System.in.read();


                        if (frase=='a' || frase=='A'){
                            contadorA++;
                            contadorVocales++;
                        }
                        else if (frase=='e' || frase=='E'){
                            contadorE++;
                            contadorVocales++;
                        }
                        else if (frase=='i' || frase=='I'){
                            contadorI++;
                            contadorVocales++;
                        }
                        else if (frase=='o' || frase=='O'){
                            contadorO++;
                            contadorVocales++;
                        }
                        else if (frase=='u' || frase=='U'){
                            contadorU++;
                            contadorVocales++;
                        }
                    }while (frase!='*');

                    if (contadorA>0){
                        System.out.println("Ha introducido: "+contadorA+" A de "+contadorVocales+" Vocales Introducidas");
                    }
                    if (contadorE>0){
                        System.out.println("Ha introducido: "+contadorE+" E de "+contadorVocales+" Vocales Introducidas");
                    }
                    if (contadorI>0){
                        System.out.println("Ha introducido: "+contadorI+" I de "+contadorVocales+" Vocales Introducidas");
                    }
                    if (contadorO>0){
                        System.out.println("Ha introducido: "+contadorO+" O de "+contadorVocales+" Vocales Introducidas");
                    }
                    if (contadorU>0){
                        System.out.println("Ha introducido: "+contadorU+" U de "+contadorVocales+" Vocales Introducidas");
                    }
                }
                break;
                case 3:{
                    System.out.println("Secuencia de opciones: "+SB);
                    SB.append(menu);
                }
                break;
                case 4:{
                    SB.setLength(0);
                    /*normalmente haría un SB = new StringBuilder(), pero
                    Juan Papa me enseñó que de esta manera no se gasta memoria o algo así */

                }
                break;
                case 5:{
                    System.out.println("SALIENDO del Menú");
                }
                break;
                default:{
                    System.out.println("Elija una opción VALIDA del 1 - 5");
                }
            }
        }while (menu!=5);

    }
}