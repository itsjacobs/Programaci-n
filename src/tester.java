import java.util.Scanner;

public class tester {
    public static void gestionMenu(){
        Scanner sc = new Scanner(System.in);
        gestion playas = new gestion();
        int opcion;
        boolean a = true;
        while (a){
            System.out.println("--------------------------");
            System.out.println("Menu de opciones");
            System.out.println("--------------------------");
            System.out.println("1. Mostrar el listado de playas");
            System.out.println("2. Dar de baja una playa");
            System.out.println("3. Dar de alta una playa");
            System.out.println("4. Listado por longitud");
            System.out.println("5. Listado por comunidad autonoma");
            System.out.println("6. modificar longitud");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    playas.mostrarArrayDePlayas();
                    break;
                case 2:
                    System.out.println("Introduce el id de la playa que quieres dar de baja");
                    int opc2 = sc.nextInt();
                    playas.darBajaPlaya(opc2);
                    break;
                case 3:
                    playas.darAltaPlaya();
                    break;
                case 4:
                    System.out.println("Introduce una longitud para mostrarte un listado de playas con longitud superior");
                    double opc3 = sc.nextDouble();
                    playas.listadoPlayas(opc3);
                    break;
                case 5:
                    System.out.println("Introduce la comunidad autonoma de la cual quieres saber la playa");
                    String opc4 = sc.nextLine();
                    playas.informacionPlayas(opc4);
                    break;
                case 6:
                    playas.modificarLongitud();
                    break;
                case 0:
                    a = false;
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        gestionMenu();
    }
}
