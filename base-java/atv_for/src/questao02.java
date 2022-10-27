import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int idade, altura, menorIdade=0, allIdades=0, allAlturas=0, mais80=0;
		double peso;
		
		for(int i=1;i<=22;i++) {
			System.out.println("qual o peso(kg) do jogador "+i+":");
			peso = sc.nextDouble();
			System.out.println("qual a idade do jogador "+i+":");
			idade = sc.nextInt();
			System.out.println("qual a altura, em centimetros, do jogador "+i+":");
			altura = sc.nextInt();
			
			if(idade<18) {
				menorIdade++;
			}
			allIdades+=idade;
			allAlturas+=altura;
			
			if(peso > 80) {
				mais80++;
			}
		}
		
		System.out.println("jogadores menores de idade: "+menorIdade);
		System.out.println("media das idades: "+(allIdades/22));
		System.out.println("media das alturas: "+(allAlturas/22));
		System.out.println("porcentagem dos jogadores com mais de 80Kg: "+((mais80/22)*100)+"%");
		
		sc.close();

	}

}
