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
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void dadosConta(String nomeCliente, String cpfCliente) {
		System.out.println("Dados da conta");
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + contaId);
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("CPF: " + cpfCliente);
		System.out.println("Saldo inicial: " + saldo);
	}
	
}
