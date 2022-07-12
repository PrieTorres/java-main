
public class TestaCaracteres {
	
	public static void main (String[] args) {
		char letra = 'a'; // char guarda somente 1 caracter,  precisa de aspas simples
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor); // char é convertido automaticamente
		
		valor = (char) (valor+1); // nao compilaria sem o (char) na frente
		System.out.println(valor);
		
		String frase = "Uma frase teste";
		System.out.println(frase);
	}

}
