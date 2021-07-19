public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300;
		if (salario >= 1900 && salario <= 2800) {
			System.out.println("Pode deduzir o valor de $142 e a alíquota é de 7.5%");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Deduz $350 e alíquota de 15%");
		} else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("Deduz $636 e alíquota de 22.5%");
		}
	}

//
//		if (salario < 2600.0) {
//			System.out.println("A sua aliquota é de 15%");
//			System.out.println("Você pode deduzir até R$ 350");
//		}
//
//		if (salario < 3750.0) {
//			System.out.println("A sua aliquota é de 22,5%");
//			System.out.println("Você pode deduzir até R$ 636");
//		}

}