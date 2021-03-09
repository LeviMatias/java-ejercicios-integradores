package integ2;

public class SocorristaMoto implements Socorrista<Moto> {
    @Override
    public void socorrer(Moto vehiculo) {
        System.out.println("Socorriendo moto "+vehiculo.getPatente());
    }
}
