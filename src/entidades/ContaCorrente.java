package entidades;

public class ContaCorrente extends Conta{
	
	public String extrato() {
		return " Extrato conta corrente\n" + toString();
	}
	
}
