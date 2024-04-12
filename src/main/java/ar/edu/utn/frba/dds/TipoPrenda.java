package ar.edu.utn.frba.dds;
import ar.edu.utn.frba.dds.Categoria;

// En segundo lugar cree la clase de tipo de prenda, la cual la define el usuario. Para crearla tiene que poner la categoria a la que pertenece este tipo de prenda
// Por ejemplo, puedo crear el tipo de prenda "remera" que pertenezca a la categoria de ParteSuperior

public class TipoPrenda {
    private Categoria categoria;
    public TipoPrenda(Categoria categoria) {
        this.categoria = categoria;
    }
    public Categoria getCategoria() {
        return categoria;
    }
}
