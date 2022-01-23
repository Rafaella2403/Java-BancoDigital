package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String operacaoConta;
		ArrayList<Integer> contas = new ArrayList<>();
		char resposta;
		
		System.out.print("Deseja criar uma conta? (S/N) ");
		resposta = sc.nextLine().toUpperCase().charAt(0);
		
		while(resposta == 'S') {
		
			System.out.print("Qual a operação da nova conta, corrente ou poupança? ");
			operacaoConta = sc.nextLine().toLowerCase();
			
			while(!(operacaoConta.equals("corrente") || operacaoConta.equals("poupanca"))) {
				System.out.println("Digite uma operação válida!");
				operacaoConta = sc.nextLine();
			}
			
			System.out.println();
			System.out.print("Digite o nome completo do cliente: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite o numero do CPF: ");
			String cpf = sc.nextLine();
			
			Cliente cliente = new Cliente(nome, cpf);
			
			System.out.println();
			System.out.print("Deseja realizar um depósito inicial? (S/N) ");
			char resp = sc.nextLine().toUpperCase().charAt(0);
			
			if(resp == 'S') {
				System.out.print("Qual o valor do depósiso? ");
				double valor = sc.nextDouble();
				
				if(operacaoConta.equals("corrente")){
					Conta cc = new ContaCorrente();						
					cc.depositar(valor);
					System.out.println();
					cc.dadosConta(cliente.getNomeCliente(), cliente.getCpfCliente());
				}
				else if (operacaoConta.equals("poupanca")){
					Conta cp = new ContaPoupanca();
					cp.depositar(valor);
					System.out.println();
					cp.dadosConta(cliente.getNomeCliente(), cliente.getCpfCliente());
				}	
			}
		}
		sc.close();
	}
}
