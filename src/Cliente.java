import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Persona {
	
	Scanner sc = new Scanner(System.in);



	private String direccion;

	private List<Pedido> pedido;

	public Cliente(String dni, String direccion, List<Pedido> pedido) {
		super(dni);
		this.direccion = direccion;
		this.pedido = pedido;
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Pedido> getPedido() {
		// comentario error
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public void realizarPedido() {
		List<Plato> platos = new ArrayList<Plato>();
		int id_platos;
		do {
			System.out.println("Seleccione un plato presionando su id(Presione 0 para salir)");
			id_platos = sc.nextInt();
			platos.add(null);
			
		}while(id_platos!=0);
		//DUDA CON COMO OBTENER EL OBJETO CON EL ID
	}
	public void Oferta() {
		
	}

}