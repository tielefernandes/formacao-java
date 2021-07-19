
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("o valor da variável 'salario' é " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int divisaoDeInteiros = 5 / 2;
		System.out.println(divisaoDeInteiros);
		// o resultado será 2, pois está dividindo inteiro 5 por inteiro 2, o resultado 
		// será um valor inteiro
		
		double tentativaDivisaoDouble = 5 / 2;
		System.out.println(tentativaDivisaoDouble);
		// o resultado será 2.0, pois será executado primiero a divisão dos dois inteiros 5 e 2 e depois
		// será visto que é um valor double, então o compilador acrescentará o valor de '.0'
		
		double maneiraCorretaDivisaoDouble = 5.0 / 2;
		System.out.println(maneiraCorretaDivisaoDouble);
		// agora o compilador conseguirá compreender que há um valor flutuante antes da divisão ocorrer
		// e retornará o resultado como flutuante 
		
		
	}

}
