package integ3;

import java.util.ArrayList;

public class Fiesta {
    public static void festejar(){
        System.out.println("La fiesta esta por comenzar");

        ArrayList<InvitadosStandard> listaDeInvitados = new ArrayList<>();
        ArrayList<Estallable> fuegos = new ArrayList<>();

        prepararFiesta(listaDeInvitados, fuegos);

        MarteSA marte = new MarteSA(fuegos);

        System.out.println("La chiqui apago las velas!!!");
        marte.reventarFuegos();
        marte.repartirTorta(listaDeInvitados);


    }

    private static void prepararFiesta(ArrayList<InvitadosStandard> listaDeInvitados, ArrayList<Estallable> fuegos){
        listaDeInvitados.add(new InvitadosStandard("Pedro"));
        listaDeInvitados.add(new InvitadosStandard("Juan"));
        listaDeInvitados.add(new InvitadosStandard("Mateo"));
        listaDeInvitados.add(new InvitadosStandard("Diego"));
        listaDeInvitados.add(new InvitadosMeli("Julia"));
        listaDeInvitados.add(new InvitadosMeli("Alvaro"));
        listaDeInvitados.add(new InvitadosMeli("Marta"));

        PackFuegoArtificial pack1 = new PackFuegoArtificial();
        PackFuegoArtificial pack2 = new PackFuegoArtificial();
        FuegoArtificial individual1 = new FuegoArtificial("BAM!");
        FuegoArtificial individual2 = new FuegoArtificial("boom!");
        fuegos.add(pack1);
        fuegos.add(pack2);
        fuegos.add(individual1);

        pack1.agregarAlPack(pack2);
        pack1.agregarAlPack(pack2);
        pack2.agregarAlPack(individual2);
        pack2.agregarAlPack(individual1);
        pack2.agregarAlPack(individual1);
        pack1.agregarAlPack(individual2);
    }
}
