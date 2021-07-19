
// contrato Autenticavel
	// quem assinar esse contrato, precisa implementar
		// metodo setSenha
		// metodo autentica

public abstract interface Auntenticavel {
	
	public abstract void setSenha(int senha);
	
	// não há nenhuma implementação, apenas as assinaturas dos métodos
	// dentro de uma classe interface não pode haver NADA concreto
	
	public abstract boolean autentica(int senha);
}
