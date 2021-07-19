
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 7434;
		primeiraConta.numero = 20045;
		primeiraConta.titular = "Tiele Fernandes";
		System.out.println(primeiraConta.agencia);
		
		primeiraConta.saldo += 100;
		System.out.println("primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 1200;
		System.out.println("segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo + segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
