
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc= new ContaCorrente(111, 111);
		cc.depoista(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.depoista(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("O valor da conta corrente é: " + cc.getSaldo());
		System.out.println("O valor da conta poupança é: " + cp.getSaldo());

	}

}
