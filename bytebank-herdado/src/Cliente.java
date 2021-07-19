
public class Cliente implements Auntenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
//		boolean autenticou = this.util.autentica(senha);
//		return autenticou;
		return this.autenticador.autentica(senha);
	}
	
}
