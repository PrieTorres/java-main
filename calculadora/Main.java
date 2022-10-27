package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opc = 1111;
		Scanner sc = new Scanner(System.in);
		
		while(opc!=0) {
			System.out.println("Menu de opcoes: "
			+"\n 0-sair"
			+"\n 1-somar numeros"
			+"\n 2-subtrair numeros"
			+"\n 3-multiplicar numeros"
			+"\n 4-dividir numeros"
			+"\n 5-potenciar numero"
			+"\n 6-raiz quadrada de numero"
			+"\n 7-porcentagem de numero"
			);
			opc = sc.nextInt();
			System.out.print("quantidade de numeros a ser calculado(o maximo é 5): ");
			int quantidade = sc.nextInt();
			
			while(quantidade<1||quantidade>5) {
				System.out.println("opcao inválida");
				System.out.print("quantidade de numeros a ser calculado(o maximo é 5): ");
				quantidade = sc.nextInt();
			}
			
			System.out.println("informe o valor");
			double mainNum = sc.nextDouble();
			double result = mainNum;
			
			switch (opc) {
				case 1:
					for(int i = 0; i < quantidade; i++) {
						result = calculadora.soma(result, 0);
					}
					System.out.println("resultado: "+result);
					break;
					
				case 2: 
					for(int i = 0; i < quantidade; i++) {
						result = calculadora.subtracao(result, 0);
					}
					System.out.println("resultado: "+result);
					break;
					
				case 3: 
					for(int i = 0; i < quantidade; i++) {
						result = calculadora.multiplicacao(result, 0);
					}
					System.out.println("resultado: "+result);
					break;
					
				case 4: 
					for(int i = 0; i < quantidade; i++) {
						result = calculadora.divisao(result, 0);
					}
					System.out.println("resultado: "+result);
					break;
					
				case 5: 
					for(int i = 0; i < quantidade; i++) {
						result = calculadora.potenciacao(result, 0);
					}
					System.out.println("resultado: "+result);
					break;
					
				case 6: 
					for(int i = 0; i < quantidade; i++) {
						result = calculadora.raiz(result);
						if(quantidade > 1) {
							System.out.println("A raiz ate aqui: "+result);
						}
					}
					System.out.println("resultado final: "+result);
					break;
					
				case 7: 
					for(int i = 0; i < quantidade; i++) {
						result = calculadora.porcentagem(result, 0);
						if(quantidade > 1) {
							System.out.println("O resultado ate aqui: "+result);
						}
					}
					System.out.println("resultado: "+result);
					break;
					
			}
			
			opc = 0;
				
		}
	}

}
