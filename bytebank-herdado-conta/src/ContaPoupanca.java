
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) { // construtor específico, pois não está herdando do construtor padrão
		super(agencia, numero);
	}

	@Override
	public void depoista(double valor) {
		super.saldo += valor;
		
	} 
	
}
