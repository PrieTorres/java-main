
public class testaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.titular = new Cliente();
		conta.titular.nome = "francisqueta pereira hernandes";
		
		System.out.println("nome: "+conta.titular.nome);
		System.out.println("conta: "+conta.toString());
	}

}
