
public class TestaGetESet {

	public static void main(String[] args) {
//		Conta conta = new Conta();
		Conta conta = new Conta(1234, 27278);
//		conta.setNumero(1137);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Tiele Fernandes"); 
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Tester");
		System.out.println(conta.getTitular().getProfissao());
	}
}
