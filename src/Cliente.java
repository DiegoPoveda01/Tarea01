public class Cliente {
	private String idCliente;
	public Tienda tienda;
	public Cliente(String idCliente, Tienda tienda){
		this.idCliente = idCliente;
		this.tienda = tienda;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
}