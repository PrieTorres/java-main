
public class CriaConta {

	public static void main(String[] args) {
		//ctrl + hover vai levar para declaração do método da classe
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		primeiraConta.depositar(450);
		
		primeiraConta.sacar(1000);
		
		System.out.println("saldo primeira conta: "+primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		primeiraConta.transfere(57, segundaConta);
		System.out.println("conta 1 saldo: "+primeiraConta.saldo);
		System.out.println("conta 2 saldo: "+segundaConta.saldo);
		
		Conta terceiraConta = new Conta();
		
		System.out.println("terceira conta: "+terceiraConta.titular);
	}

}
