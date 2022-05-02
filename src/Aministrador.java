import java.util.List;

public class Aministrador extends Persona {

	private String contraseña;

	private List<Plato> plato;

	public Aministrador(String dni, String contraseña, List<Plato> plato) {
		super(dni);
		this.contraseña = contraseña;
		this.plato = plato;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public List<Plato> getPlato() {
		return plato;
	}

	public void setPlato(List<Plato> plato) {
		this.plato = plato;
	}
	
	public void comprarIngredientes(Ingrediente x) {
		if(x.Cantidad_suficiente() == false) {
			x.setCantidad(2000.00);
		}
		//DUDA CON ATRIBUTO CANTIDAD
		//DUDA CON LA CLASE Y LA TABLA PERSONA
	}





}