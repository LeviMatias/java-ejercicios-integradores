package integ2;

public abstract class Vehiculo {
    private String patente;
    private float velocidad;
    private float acceleracion;
    private float peso;
    private float anguloDeGiro;
    private int ruedas;


    public Vehiculo(String patente, int ruedas, float velocidad, float acceleracion, float peso, float anguloDeGiro) {
        this.patente = patente;
        this.velocidad = velocidad;
        this.acceleracion = acceleracion;
        this.peso = peso;
        this.anguloDeGiro = anguloDeGiro;
        this.ruedas = ruedas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getAcceleracion() {
        return acceleracion;
    }

    public void setAcceleracion(float acceleracion) {
        this.acceleracion = acceleracion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(float anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
