package lab5_jorgevega;
/**
Jorge Vega
 */
public class Facultad_Ingenieria extends Clase_Carreras{
    private String STRING;

    public Facultad_Ingenieria() {
        super();
    }

    public Facultad_Ingenieria(String STRING, String NOMBRE, String FACU, String JEFE_CARRERA, float COSTO) {
        super(NOMBRE, FACU, JEFE_CARRERA, COSTO);
        this.STRING = STRING;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    @Override
    public String toString() {
        return  super.getNOMBRE();
    }
    
    
}
