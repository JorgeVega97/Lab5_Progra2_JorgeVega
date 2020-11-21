package lab5_jorgevega;

/**
Jorge Vega
 */
public class Clase_Carreras {
    private String NOMBRE;
    private String FACU;
    private String JEFE;
    private float COSTO;

    public Clase_Carreras() {
    }

    public Clase_Carreras(String NAME, String FACULTAD, String JE_CARRE, float COS) {
        this.NOMBRE = NAME;
        this.FACU = FACULTAD;
        this.JEFE = JE_CARRE;
        this.COSTO = COS;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getFACU() {
        return FACU;
    }

    public void setFACU(String FACU) {
        this.FACU = FACU;
    }

    public String getJEFE() {
        return JEFE;
    }

    public void setJEFE(String JEFE) {
        this.JEFE = JEFE;
    }

    public float getCOSTO() {
        return COSTO;
    }

    public void setCOSTO(float COSTO) {
        this.COSTO = COSTO;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + NOMBRE + ", FACULTAD: " + FACU + ", JEFE DE CARRERA: " + JEFE + ", COSTO DE MENSUALIDAD: " + COSTO ;
    }
 
    
    
    
    
}
