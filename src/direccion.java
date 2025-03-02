import java.util.Random;

public class direccion {
    //Atributos
    private String calle;
    private String CP;
    private String CA;
    public static final String[] calles = {"San Lamberto","Nuestra Señora del villar","Avenida de Guadalajara"," de Merida"};
    public static final String[] Codigos = {"28017","28016","18234","12345"};
    public static final String[] Comunidades = {"Andalucia","Extremadura","Madrid","Asturias"};

    //Constructores
    public direccion(String calle, String CP, String CA) {
        this.calle = calle;
        this.CP = CP;
        this.CA = CA;
    }
    public direccion() {
        Random rnd = new Random();
        this.calle = calles[rnd.nextInt(0,calles.length)];
        this.CP = Codigos[rnd.nextInt(0,Codigos.length)];
        this.CA = Comunidades[rnd.nextInt(0,Comunidades.length)];
    }
    //getter & setters
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }
    public String getCP(){
        return CP;
    }
    public void setCP(String CP){
        this.CP = CP;
    }
    public String getCA(){
        return CA;
    }
    public void setCA(String CA){
        this.CA = CA;
    }

    //Métodos

    @Override
    public String toString() {
        return "\ncalle: " + calle+
                "\nCP: " + CP +
                "\nCA: " + CA;
    }
}
