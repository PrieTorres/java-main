
public class TestaCondicionais2 {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 18;
		int quantidadePessoas = 1;

		boolean estaAcompanhado = quantidadePessoas >= 2;
		boolean maiorDeIdade = idade >= 18;

		if (maiorDeIdade || estaAcompanhado) {
			System.out.println("Voc� pode entrar");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}

	}

}
