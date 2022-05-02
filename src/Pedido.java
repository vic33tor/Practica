
import java.time.LocalDate;
import java.util.List;

public class Pedido {

	private Integer id_pedido;

	private LocalDate fecha;

	private Double precio;
	
	private int contador_pedidos = 1;

	private List<Plato> plato;



	public Pedido(Double precio, List<Plato> plato) {
		this.id_pedido = contador_pedidos;
		this.fecha = LocalDate.now();
		this.precio = precio;
		this.plato = plato;
		contador_pedidos ++;
	}
	public Integer getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public List<Plato> getPlato() {
		return plato;
	}

	public void setPlato(List<Plato> plato) {
		this.plato = plato;
	}

	

}