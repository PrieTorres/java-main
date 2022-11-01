
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "paulo silveira agnes nunes";
		paulo.cpf = "111.22.33-44";
		paulo.profissao = "visionário criativo";
		
		Conta conta = new Conta();
		
		conta.titular = paulo;
		
		System.out.println(conta.titular.nome);
	}
	
}
