package ar.edu.utn.frba.dds;
import ar.edu.utn.frba.dds.Prenda;
import java.util.*;

import java.util.ArrayList;

// Luego el atuendo lo defini como una clase que va a tener un conjunto de prendas

public class Atuendo {
    private String nombreDelAtuendo;
    private List<Prenda> prendas = new ArrayList<Prenda>();

    public Atuendo(String nombreDelAtuendo) {
        this.nombreDelAtuendo = nombreDelAtuendo;
    }
    //Agregar prendas
    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }
    //Obtener el atuendo
    public List<Prenda> getPrendas() {
        return this.prendas;
    }
}
