
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("o valor da vari�vel 'salario' � " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int divisaoDeInteiros = 5 / 2;
		System.out.println(divisaoDeInteiros);
		// o resultado ser� 2, pois est� dividindo inteiro 5 por inteiro 2, o resultado 
		// ser� um valor inteiro
		
		double tentativaDivisaoDouble = 5 / 2;
		System.out.println(tentativaDivisaoDouble);
		// o resultado ser� 2.0, pois ser� executado primiero a divis�o dos dois inteiros 5 e 2 e depois
		// ser� visto que � um valor double, ent�o o compilador acrescentar� o valor de '.0'
		
		double maneiraCorretaDivisaoDouble = 5.0 / 2;
		System.out.println(maneiraCorretaDivisaoDouble);
		// agora o compilador conseguir� compreender que h� um valor flutuante antes da divis�o ocorrer
		// e retornar� o resultado como flutuante 
		
		
	}

}
