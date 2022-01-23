package entidades;

public class ContaPoupanca extends Conta{
	public String extrato() {
		return " Extrato conta poupança\n" + toString();
	}
}
