package ar.edu.utn.frba.dds;
import ar.edu.utn.frba.dds.*;
//En esta clase haremos de cuenta que somos un usuario
public class Main {
    public static void main(String[] args) {
    // creamos los tipo de prendas
        TipoPrenda remera = new TipoPrenda(Categoria.ParteSuperior);
        TipoPrenda jean = new TipoPrenda(Categoria.ParteInferior);
        TipoPrenda zapatillasUrbanas = new TipoPrenda(Categoria.Calzado);
        TipoPrenda gafasDeSol = new TipoPrenda(Categoria.Accesorios);
        // Cremos las prendas
        Prenda pantalonLewis = new Prenda(2, jean, "Tela premium","Azul");
        Prenda remeraGuchi = new Prenda(1, remera,"lino" ,"rojo");
        // Creamos el atuendo
        Atuendo outfit1 = new Atuendo("outfitveraniego");
        // Agregamos las prendas
        outfit1.agregarPrenda(remeraGuchi);
        outfit1.agregarPrenda(pantalonLewis);
        // A modo de testeo vamos a obtener la lista de prendas de un atuendo, cual es la categoria y tipo de prenda de una prenda x
        System.out.println(outfit1.getPrendas());
        System.out.println(remeraGuchi.categoria());
        System.out.println(remeraGuchi.tipoDePrenda());
    }

}
