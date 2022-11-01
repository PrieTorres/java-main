
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.saldo = 100;
		conta1.depositar(50);
		
		System.out.println(conta1.saldo);
		
		boolean retirado = conta1.sacar(20);
		System.out.println("tranferencia realizada: "+retirado);
		System.out.println("saldo: "+conta1.saldo);
		
	}
}
