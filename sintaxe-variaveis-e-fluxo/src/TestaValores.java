public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = segundo; // essa variável não "importará"
		
		// quanto vale o a variável 'segundo'?
		System.out.println(segundo);
	}
}
