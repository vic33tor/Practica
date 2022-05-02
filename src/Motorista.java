import java.util.List;

public class Motorista {

	private String dni_motorista;

	private String nombre;

	private String fecha_ingreso;

	private Boolean activo;

	private List<Pedido> pedido;



	public Motorista(String dni_motorista, String nombre, String fecha_ingreso, Boolean activo, List<Pedido> pedido) {
		this.dni_motorista = dni_motorista;
		this.nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
		this.activo = activo;
		this.pedido = pedido;
	}

	public String getDni_motorista() {
		return dni_motorista;
	}

	public void setDni_motorista(String dni_motorista) {
		this.dni_motorista = dni_motorista;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public void Llevar_pedido(Pedido ped) {
		pedido.add(ped);
		activo = false;
		//DUDA CON ATRIBUTO ACTIVO
		//DUDA CON OBJETO MOTORISTA
	}

}