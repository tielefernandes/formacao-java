
public class TestaContas {

	public static void main(String[] args) {
		Conta conta = new Conta(1748, 225569);
		
		conta.depoista(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("o total de contas é: " + Conta.getTotal());

	}

}
