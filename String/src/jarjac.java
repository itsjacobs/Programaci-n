import java.util.Random;

public class jarjac {
    public static final String [] NOMBRES = {"X","Y","E","R","V","H","G","J","Ñ","Z","M","P"};
    public static void main(String[] args){
        Random rnd = new Random();

        for (int i = 1; i<100;i++){
            System.out.println(NOMBRES[rnd.nextInt(NOMBRES.length)]);
        }
    }
}
