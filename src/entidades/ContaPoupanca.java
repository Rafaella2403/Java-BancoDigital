package entidades;

public class ContaPoupanca extends Conta{
	public String extrato() {
		return " Extrato conta poupan�a\n" + toString();
	}
}
