package entidades;

import interfaces.InterfaceConta;

public abstract class Conta implements InterfaceConta{

	protected int contaId;
	private static final int AGENCIA = 1568;
	protected double saldo;
	protected int agencia;
	private static int SEQUENCIAL = 1;

	public Conta() {
		this.agencia = AGENCIA;
		this.contaId = SEQUENCIAL ++;
	}
	
	public int getContaId() {
		return contaId;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferencia(double valor, Conta contaDestino) {
		sacar(valor);
	}

}
