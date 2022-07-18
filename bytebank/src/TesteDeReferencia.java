
public class TesteDeReferencia {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		
		
		System.out.println("1 --> "+primeiraConta.saldo);
		System.out.println("2 --> "+segundaConta.saldo);
		
		
	}

}
