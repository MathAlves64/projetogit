package br.com.matheus.projetogit;

public class classePrincipal {

	public static void main(String[] args) {
	
		
		classeConta objetoConta1 = new classeConta(); // Instancia um objeto
		objetoConta1.atributoPessoaConta = new classePessoa();
		
		objetoConta1.atributoNomeConta.atributp = "Vitor Hugo";
		objetoConta1.atributoNumeroConta = 1234;
		//objetoConta1.atributoSaldoConta = 450000.00 + (450000.00 * .20); //+ 20%
		//objetoConta1.atributoSaldoConta = 450000.00;
		objetoConta1.metodoDepositar(450000.00);
		
		
		System.out.println(objetoConta1.atributoNomeConta);
		System.out.println(objetoConta1.atributoNumeroConta);
		System.out.println(objetoConta1.atributoSaldoConta);
		
		classeConta objetoConta2 = new classeConta(); //instancia um objeto
		objetoConta2.atributoPessoaConta = new classePessoa();

		
		objetoConta2.atributoPessoaConta.atributoNomePessoa = "Handreya";
		objetoConta2.atributoNumeroConta.atributoCPFessoa = 4321;

		
		//objetoConta2.atributoSaldoConta = 14000.50 + (14000.50 * .20); //+ 20%
		//objetoConta2.atributoSaldoConta = 14000.50;
		objetoConta2.metodoDepositar(14000.50);


	}

}
