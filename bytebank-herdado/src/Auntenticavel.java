
// contrato Autenticavel
	// quem assinar esse contrato, precisa implementar
		// metodo setSenha
		// metodo autentica

public abstract interface Auntenticavel {
	
	public abstract void setSenha(int senha);
	
	// n�o h� nenhuma implementa��o, apenas as assinaturas dos m�todos
	// dentro de uma classe interface n�o pode haver NADA concreto
	
	public abstract boolean autentica(int senha);
}
