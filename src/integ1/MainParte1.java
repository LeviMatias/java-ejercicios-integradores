package integ1;

import java.util.ArrayList;

public class

MainParte1 {
    public static void correrMain(){
        ArrayList<Prenda> misPrendas1 = new ArrayList<Prenda>();
        ArrayList<Prenda> misPrendas2 = new ArrayList<Prenda>();
        ArrayList<Prenda> misPrendas3 = new ArrayList<Prenda>();
        misPrendas1.add(new Prenda("Gucci", "Remera"));
        misPrendas1.add(new Prenda("Gap", "Pantalon"));
        misPrendas2.add(new Prenda("Puma", "Medias"));
        misPrendas2.add(new Prenda("Adidas", "Short"));
        misPrendas2.add(new Prenda("Nike", "Remera"));
        misPrendas3.add(new Prenda("Prada", "Bufanda"));
        misPrendas3.add(new Prenda("Polo", "Camisa"));

        Guardarropas guardarropas = new Guardarropas();
        int numero1 = guardarropas.guardarPrendas(misPrendas1);
        int numero2 = guardarropas.guardarPrendas(misPrendas2);
        int numero3 = guardarropas.guardarPrendas(misPrendas3);

        System.out.println("Antes de devolver prenda");
        guardarropas.mostrarPrendas();

        System.out.println("\nSacamos las prendas de "+numero2);
        guardarropas.devolverPrendas(numero2);

        guardarropas.mostrarPrendas();
    }
}
