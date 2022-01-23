package aplicacao;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Banco {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		System.out.println(cc);
		System.out.println();
		System.out.println(cp);

	}

}
