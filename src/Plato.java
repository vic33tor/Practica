import java.util.List;

public class Plato {

	private Integer id_plato;

	private String nombre;

	private Double precio;

	private List<Ingrediente> ingrediente;
	
	int contador_platos = 1;

	public Plato(String nombre, Double precio, List<Ingrediente> ingrediente) {
		this.id_plato = contador_platos;
		this.nombre = nombre;
		this.precio = precio;
		this.ingrediente = ingrediente;
		contador_platos++;
	}

	public Integer getId_plato() {
		return id_plato;
	}

	public void setId_plato(Integer id_plato) {
		this.id_plato = id_plato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public List<Ingrediente> getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(List<Ingrediente> ingrediente) {
		this.ingrediente = ingrediente;
	}





}