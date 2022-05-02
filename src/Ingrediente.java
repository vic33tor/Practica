public class Ingrediente {

	private Integer id_ingrediente;

	private String nombre;

	private Double cantidad;
	
	int contador_ingredientes = 1;




	public Ingrediente(Integer id_ingrediente, String nombre) {
		this.id_ingrediente = contador_ingredientes;
		this.nombre = nombre;
		this.cantidad = 0.0;
		contador_ingredientes ++;
	}



	public Integer getId_ingrediente() {
		return id_ingrediente;
	}



	public void setId_ingrediente(Integer id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Double getCantidad() {
		return cantidad;
	}



	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}



	

	public boolean Cantidad_suficiente() {
		if(cantidad<100) {
			return false;
		}
		else {
			return true;
		}
	}//cambio

}