package lab5_jorgevega;

import java.util.ArrayList;

/**
Jorge Vega
 */
public class Clase_Maestro {
    private String NAME;
    private String APELLI;
    private float SUELDO;
    private int EDAD;
    private ArrayList <Clase_Asignaturas> ASIGNATURAS = new ArrayList();

    public Clase_Maestro() {
    }

    public Clase_Maestro(String NAME, String APELLI, float SUELDO, int EDAD, ArrayList ASIGNAT) {
        this.NAME = NAME;
        this.APELLI = APELLI;
        this.SUELDO = SUELDO;
        this.EDAD = EDAD;
        this.ASIGNATURAS = ASIGNAT;
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

    public float getSUELDO() {
        return SUELDO;
    }

    public void setSUELDO(float SUELDO) {
        this.SUELDO = SUELDO;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public ArrayList<Clase_Asignaturas> getClases() {
        return ASIGNATURAS;
    }

    public void setClases(ArrayList<Clase_Asignaturas> Clases) {
        this.ASIGNATURAS = Clases;
    }

    @Override
    public String toString() {
        return "MAESTROS: " + "NOMBRE: " + NAME + " APELLIDO:" + APELLI + " SALARIO:" + SUELDO + ", EDAD:" + EDAD + " ASIGNATURAS QUE IMPARTE:" + ASIGNATURAS;
    }
    
    
}
