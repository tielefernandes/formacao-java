
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("voc� � maior de idade");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("voc� � novinho mas est� "
						+ "acompanhado");
			} else {
				System.out.println("infelizmente voc� � novinho "
						+ "demais e est� sozinho");
			}
		}
	}

}
