package lab5_jorgevega;

/**
 *Jorge Vega
 */
public class Facultad_Medicina extends Clase_Carreras{
    private String STRING;

    public Facultad_Medicina() {
        super();
    }

    public Facultad_Medicina(String STRING, String NOMBRE, String FACULTAD, String JEFE_CARRERA, float COSTO) {
        super(NOMBRE, FACULTAD, JEFE_CARRERA, COSTO);
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
