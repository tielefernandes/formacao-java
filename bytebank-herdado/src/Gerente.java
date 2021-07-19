
//Gerente eh um Funcionario, portanto herda da classe Funcionario e utiliza os métodos do "contrato" Autenticavel
public class Gerente extends Funcionario implements Auntenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getBoniticacao() {
		return getBoniticacao() + super.getSalario();
	}

}