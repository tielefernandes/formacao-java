
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) { // construtor espec�fico, pois n�o est� herdando do construtor padr�o
		super(agencia, numero);
	}

	@Override
	public void depoista(double valor) {
		super.saldo += valor;
		
	} 
	
}
