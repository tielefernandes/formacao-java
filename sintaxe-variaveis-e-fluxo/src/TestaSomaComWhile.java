
public class TestaSomaComWhile {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while(contador <= 10) {
			total += contador;
			contador++;
			System.out.println("a iteração é: " + total);
		}
		System.out.println("a somatória total é: "+ total);
	}

}
