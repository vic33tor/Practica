import java.util.List;

public class Aministrador extends Persona {

	private String contrase�a;

	private List<Plato> plato;

	public Aministrador(String dni, String contrase�a, List<Plato> plato) {
		super(dni);
		this.contrase�a = contrase�a;
		this.plato = plato;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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