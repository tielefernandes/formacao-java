public class TestaEscopo {

	public static void main(String[] args) {
//		System.out.println("testando escopo");
		int idade = 18;
		int quantidadePessoas = 3;
//		// boolean acompanhado = quantidadePessoas >= 2;
//		if (quantidadePessoas >= 2) {
//			boolean acompanhado = true;
//		} else {
//			boolean acompanhado = false;
//			System.out.println(acompanhado); // aqui está dentro do escopo, no qual a variável foi declarada
//		}
//		// System.out.println(acompanhado); nesse escopo a variável 'acompanhado' não existe mais,
//		// pois está fora das chaves onde a variável declarada. '{}'
//	}
//	
		boolean acompanhado;
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
			System.out.println(acompanhado);
		}

	}
}
