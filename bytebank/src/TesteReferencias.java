public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("s�o a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
