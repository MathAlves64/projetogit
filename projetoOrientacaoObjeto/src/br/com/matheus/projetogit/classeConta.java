package br.com.matheus.projetogit;

public class classeConta {
	
	int atributoNumeroConta; //0
	String atributoNomeConta; //Null //Null != ""
	double atributoSaldoConta; //0.0
	int atributoNomePessoa;
	
	classePessoa atributoPessoaConta;
	
	
	
	void metodoDepositar(double parametroValor) { //Método
		
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValor + (parametroValor *.10);
		//this.atributoSaldoConta += parametroValor;
		
		
	}

}
