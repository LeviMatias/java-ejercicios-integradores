package integ1;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Guardarropas {
    HashMap<Integer, ArrayList<Prenda>> prendas;
    int contador;

    public Guardarropas() {
        this.contador = 0;
        this.prendas = new HashMap<Integer,ArrayList<Prenda>>();
    }

    public Integer guardarPrendas(ArrayList<Prenda> prendasAGuardar){
        prendas.put(contador, prendasAGuardar);
        contador++;
        return (contador - 1);
    }

    public void mostrarPrendas(){
        for(HashMap.Entry<Integer, ArrayList<Prenda>> entry : prendas.entrySet()){
            System.out.println("\nPara el numero " + entry.getKey() + " tenemos");
            for (Prenda p: entry.getValue()){
                System.out.println(p.getMarca() + " "+ p.getModelo());
            }
        }
    }

    public ArrayList<Prenda> devolverPrendas(int id){
        try{
            return prendas.remove(id);
        } catch (Exception e){
            e.printStackTrace();
            return new ArrayList<Prenda>();
        }
    }
}
