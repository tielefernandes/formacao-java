
public class TestaSomaComWhile {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while(contador <= 10) {
			total += contador;
			contador++;
			System.out.println("a itera��o �: " + total);
		}
		System.out.println("a somat�ria total �: "+ total);
	}

}
