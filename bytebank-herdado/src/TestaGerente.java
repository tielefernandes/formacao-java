
public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setCpf("4564564");
		g1.setSalario(5000.0);
		
//		Auntenticavel referencia = new Cliente();
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);
		System.out.println(g1.getBoniticacao());
	}

}
