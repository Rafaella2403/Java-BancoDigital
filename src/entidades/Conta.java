package entidades;

public class Conta {

	private int contaId;
	private int agencia;
	private double saldo;
	
	public Conta(int contaId, int agencia, double saldo) {
		super();
		this.contaId = contaId;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public int getContaId() {
		return contaId;
	}
	public int getAgencia() {
		return agencia;
	}
	public double getSaldo() {
		return saldo;
	}

}
