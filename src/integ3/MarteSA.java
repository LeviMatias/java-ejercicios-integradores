package integ3;

import java.util.ArrayList;

public class MarteSA {
    private ArrayList<Estallable> fuegosArtificiales;

    public MarteSA(ArrayList<Estallable> f){
        fuegosArtificiales = f;
    }

    public void reventarFuegos(){
        for (Estallable f: fuegosArtificiales){
            f.estallar();
        }
    }

    public ArrayList<Estallable> getFuegosArtificiales() {
        return fuegosArtificiales;
    }

    public void repartirTorta(ArrayList<InvitadosStandard> invitados){
        for (InvitadosStandard i: invitados) i.comerTorta();
    }

}
