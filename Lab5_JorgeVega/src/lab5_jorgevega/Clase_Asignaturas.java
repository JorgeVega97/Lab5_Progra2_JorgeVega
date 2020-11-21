package lab5_jorgevega;
/**
 *Jorge Vega
 */
public class Clase_Asignaturas {
    private String NAME;
    private String SECC;
    private String EDIFICIO;
    private String AULA;
    private String ACONDICIONADA;

    public Clase_Asignaturas() {
    }

    public Clase_Asignaturas(String NOMBRE, String SECCION, String EDI, String AULA, String AIR) {
        this.NAME = NOMBRE;
        this.SECC = SECCION;
        this.EDIFICIO = EDI;
        this.AULA = AULA;
        this.ACONDICIONADA = AIR;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSECC() {
        return SECC;
    }

    public void setSECC(String SECC) {
        this.SECC = SECC;
    }

    public String getEDIFICIO() {
        return EDIFICIO;
    }

    public void setEDIFICIO(String EDIFICIO) {
        this.EDIFICIO = EDIFICIO;
    }

    public String getAULA() {
        return AULA;
    }

    public void setAULA(String AULA) {
        this.AULA = AULA;
    }

    public String getACONDICIONADA() {
        return ACONDICIONADA;
    }

    public void setACONDICIONADA(String ACONDICIONADA) {
        this.ACONDICIONADA = ACONDICIONADA;
    }

    @Override
    public String toString() {
        return NAME ;
    }
    
    
}
