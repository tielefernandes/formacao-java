public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = segundo; // essa vari�vel n�o "importar�"
		
		// quanto vale o a vari�vel 'segundo'?
		System.out.println(segundo);
	}
}
