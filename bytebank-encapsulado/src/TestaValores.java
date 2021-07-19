
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1234, 27278);
		
		System.out.println(conta.getAgencia());
		
//		Conta conta2 = new Conta(1337, 25669);
//		Conta conta3 = new Conta(2113, 25457);
		
		System.out.println(Conta.getTotal());
	}

}
