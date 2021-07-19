
public class ControleBonificacao {

	private double soma;
	
	public void registra(Gerente g) {
		double bonus = g.getBoniticacao();
		this.soma = this.soma + bonus;
		
	}
	
	public void registra(Funcionario f) {
		double bonus = f.getBoniticacao();
		this.soma = this.soma + bonus;
		
	}

	public double getSoma() {
		return soma;
	}
}
