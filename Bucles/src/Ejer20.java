public class Ejer20 {

    public static void main (String[] args){
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        while (horas < 23){
            minutos = 0;
            horas++;
            while (minutos < 59){}
            segundos = 0;
            minutos++;
            while (segundos < 59){
                segundos++;
                System.out.printf("%02d:%02d:%02d", horas, minutos,segundos);
            }
        }
    }
}
