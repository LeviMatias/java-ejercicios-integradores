package integ3;

public class InvitadosMeli extends InvitadosStandard {

    public InvitadosMeli(String nombre) {
        super(nombre);
    }

    @Override
    public void comerTorta(){
        super.comerTorta();
        System.out.println("Viva la Chiqui!!!");
    }
}
