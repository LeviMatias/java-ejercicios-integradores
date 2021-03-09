package integ3;

import java.util.ArrayList;

public class PackFuegoArtificial implements Estallable{
    ArrayList<Estallable> fuegosArtificiales;

    public PackFuegoArtificial(){
        fuegosArtificiales = new ArrayList<Estallable>();
    }

    @Override
    public void estallar() {
        for(Estallable f: fuegosArtificiales){
            f.estallar();
        }
    }

    public void agregarAlPack(Estallable f){
        fuegosArtificiales.add(f);
    }
}
