import java.util.Random;

public class playasGrandes extends playa{
    //Atributos
    private String bandera;
    public static final String[] banderas = {"Verde","Amarilla","Roja"};
    public static final String[] Nombres = {"playa de la concha","playa de las catedrales","la Barceloneta","playa de San Miquel"};

    //Constructores
    public playasGrandes(int id, String nombre, direccion direccion,double longitud,int valoracion,String bandera){
        super(id, nombre, direccion, longitud, valoracion);
        this.bandera = bandera;
    }
    public playasGrandes(){
        Random rnd = new Random();
        this.bandera = banderas[rnd.nextInt(0,banderas.length)];
        this.setNombre(Nombres[rnd.nextInt(0,Nombres.length)]);
    }
    //getters & setters

    public String getBandera(){
        return bandera;
    }
    public void setBandera(String bandera){
        this.bandera = bandera;
    }

    //métodos
    public int getPuntuacion(){
        int media = this.valoracionMedia();
        if (getLongitud() > 2 && bandera.equals("Verde")){
            media = media + 1;
        }
        return media;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbandera: " + bandera;
    }
}
