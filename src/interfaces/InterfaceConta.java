package interfaces;

import entidades.Conta;

public interface InterfaceConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferencia(double valor, Conta contaDestino);
	
	String toString();
	
}
