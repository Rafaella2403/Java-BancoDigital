package entidades;

public class Cliente {

	private String nomeCliente;
	private int cpfCliente;
	private int agencia;
	
	public Cliente(String nomeCliente, int cpfCliente, int agencia) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.agencia = agencia;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCpfCliente() {
		return cpfCliente;
	}

}
