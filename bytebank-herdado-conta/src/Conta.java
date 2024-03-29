public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; //composi��o
	private static int total;
	
	public Conta() {
		
	} // construtor padr�o
	
	public Conta(int agencia, int numero) {
		total++; //Conta.total++
		//System.out.println("o total de contas abertas � " + total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando a conta " + this.numero);
	}
	
	public abstract void depoista(double valor);
//		this.saldo += valor;
//		// this.saldo = this.saldo + valor;
	

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
//			this.saldo -= valor;
			destino.depoista(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("n�o pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("n�o pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}