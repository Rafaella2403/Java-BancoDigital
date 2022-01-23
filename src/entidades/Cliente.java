package entidades;

public class Cliente {

	private String nomeCliente;
	private String cpfCliente;
	
	public Cliente(String nomeCliente, String cpfCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getCpfCliente() {
		return cpfCliente;
	}

}
