package integ2;

public class SocorristaAuto implements Socorrista<Auto> {
    @Override
    public void socorrer(Auto vehiculo) {
        System.out.println("Socorriendo auto "+vehiculo.getPatente());
    }
}
