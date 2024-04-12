package ar.edu.utn.frba.dds;
import ar.edu.utn.frba.dds.TipoPrenda;
//Luego creamos la prenda, la cual va a tener un id (de modo informativo), el tipo de prenda el cual ha sido creado anteriormente.
//* El usuario puede definir el material con el cual está hecho

public class Prenda {
    private int id;
    private TipoPrenda tipoDePrenda;
    private String material;
    private String colorPrincipal;
    private String colorSecundario;
    // El usuario puede definir si desea el color secundario
    public Prenda(int id,TipoPrenda tipoDePrenda, String material,String colorPrincipal, String colorSecundario) {
        this.id = id;
        this.tipoDePrenda = tipoDePrenda;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }
    // Si no quiere color secundario, utiliza este constructor. Tambien se cumple el requerimiento que dice que una prenda no puede tener campos vacios, ya que para iniciar
    //el objeto si o si como minimo tiene que cargar estos valores
    public Prenda(int id,TipoPrenda tipoDePrenda, String material,String colorPrincipal) {
        this.id = id;
        this.tipoDePrenda = tipoDePrenda;
        this.material =material;
        this.colorPrincipal = colorPrincipal;
    }
    //quiero identificar a qué categoría pertenece una prenda
    public Categoria categoria() {
        return this.tipoDePrenda.getCategoria();
    }
    public TipoPrenda tipoDePrenda() {
        return this.tipoDePrenda;
    }
}

