package integ3;

public class FuegoArtificial implements Estallable {
    private String ruido;

    public FuegoArtificial(String ruido){
        this.ruido = ruido;
    }

    public void estallar(){
        System.out.println(ruido);
    }
}
