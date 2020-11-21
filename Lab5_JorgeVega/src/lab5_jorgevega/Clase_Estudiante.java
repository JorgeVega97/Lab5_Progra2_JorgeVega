package lab5_jorgevega;
/**
 Jorge Vega
 */
public class Clase_Estudiante {
    private String GENE;
    private String APELLI;
    private String NAME;
    private String CARRE;
    private int EDAD;
    private int COUNT;
    

    public Clase_Estudiante() {
    }

    public Clase_Estudiante(String NOMBRE, String APELLIDO, int NUM_CUENTA, String SEXO, int EDAD, String COURS) {
        this.NAME = NOMBRE;
        this.APELLI = APELLIDO;
        this.COUNT = NUM_CUENTA;
        this.GENE = SEXO;
        this.EDAD = EDAD;
        this.CARRE = COURS;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getAPELLI() {
        return APELLI;
    }

    public void setAPELLI(String APELLI) {
        this.APELLI = APELLI;
    }

    public int getCOUNT() {
        return COUNT;
    }

    public void setCOUNT(int COUNT) {
        this.COUNT = COUNT;
    }

    public String getGENE() {
        return GENE;
    }

    public void setGENE(String GENE) {
        this.GENE = GENE;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public String getCARRE() {
        return CARRE;
    }

    public void setCARRE(String CARRE) {
        this.CARRE = CARRE;
    }

    

    @Override
    public String toString() {
        return "NOMBRE:" + NAME + " APELLIDO: " + APELLI + ", GENERO: " + GENE + ", EDAD: " + EDAD + ", CARRERA: " + CARRE;
    }
    
    
}
