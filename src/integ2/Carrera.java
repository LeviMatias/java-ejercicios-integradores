package integ2;

import java.util.ArrayList;

public class Carrera {
    private float distancia;
    private float premioEnDolares;
    private String nombre;
    private int cantidadDeVehiculosPermitidos;
    private ArrayList<Vehiculo> listaDeVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;


    public Carrera(float distancia, float premioEnDolares, String nombre, int cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        listaDeVehiculos = new ArrayList<Vehiculo>();
        socorristaAuto = new SocorristaAuto();
        socorristaMoto = new SocorristaMoto();
    }

    public void socorrerAuto(String patente){
        for (int i = 0; i < listaDeVehiculos.size(); i++){
            if (listaDeVehiculos.get(i).getPatente().equals(patente)){
                socorristaAuto.socorrer((Auto)listaDeVehiculos.get(i));
                return;
            }
        }
        System.out.println("El vehiculo no se encuentra en la carrera");
    }

    public void socorrerMoto(String patente){
        for (int i = 0; i < listaDeVehiculos.size(); i++){
            if (listaDeVehiculos.get(i).getPatente().equals(patente)){
                socorristaMoto.socorrer((Moto)listaDeVehiculos.get(i));
                return;
            }
        }
        System.out.println("El vehiculo no se encuentra en la carrera");
    }

    public void darDeAltaAuto(float velocidad, float aceleracion, float anguloDeGiro, String patente){
        darDeAltaVehiculo(new Auto(patente, velocidad, aceleracion, anguloDeGiro));
    }

    public void darDeAltaMoto(float velocidad, float aceleracion, float anguloDeGiro, String patente){
        darDeAltaVehiculo(new Moto(patente,velocidad, aceleracion, anguloDeGiro));
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String patente){
        for (int i = 0; i < listaDeVehiculos.size(); i++){
            if (listaDeVehiculos.get(i).getPatente().equals(patente)){
                listaDeVehiculos.remove(i);
                break;
            }
        }
    }

    public void ganador(){
        if (listaDeVehiculos.size() == 0){
            System.out.println("No hay competidores");
            return;
        }

        Vehiculo ganador = null;
        float max = -1;

        for (Vehiculo v: listaDeVehiculos){
            float valor = v.getVelocidad()*(1/2.0f)*v.getAcceleracion()/(v.getAnguloDeGiro()*(v.getPeso()-v.getRuedas()*100));
            if (valor > max){
                ganador = v;
                max = valor;
            }
        }

        System.out.println("El ganador es "+ ganador.getPatente());
    }

    private void darDeAltaVehiculo(Vehiculo v){
        if (listaDeVehiculos.size() == cantidadDeVehiculosPermitidos){
            listaDeVehiculos.add(v);
        }
        else
            System.out.println("No hay más cupos para la carrera :(");
    }
}
