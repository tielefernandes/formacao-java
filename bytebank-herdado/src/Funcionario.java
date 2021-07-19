// n�o pode instanciar dessa classe, pois esssa � abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// na classe m�e n�o h� implementa��o, apenas nos filhos.
	public abstract double getBoniticacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
