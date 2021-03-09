package integ2;

public class Moto extends Vehiculo{
    private final static float PESO_MOTO = 300;
    private final static int RUEDAS = 2;

    public Moto(String patente, float velocidad, float acceleracion, float anguloDeGiro) {
        super(patente, RUEDAS, velocidad, acceleracion, PESO_MOTO, anguloDeGiro);
    }
}
