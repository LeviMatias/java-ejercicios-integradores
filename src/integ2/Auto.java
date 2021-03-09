package integ2;


public class Auto extends Vehiculo {
    private final static float PESO_AUTO = 1000;
    private final static int RUEDAS = 4;

    public Auto(String patente, float velocidad, float acceleracion, float anguloDeGiro) {
        super(patente, RUEDAS, velocidad, acceleracion, PESO_AUTO, anguloDeGiro);
    }
}
