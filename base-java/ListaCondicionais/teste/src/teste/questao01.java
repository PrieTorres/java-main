package teste;
import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lab, ava, exam, notaFinal;
		String conceito = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a nota da avaliação trimestral: ");
		ava = sc.nextDouble();
		ava = ava * 0.3;
		System.out.print("Insira a nota do laboratório: ");
		lab = sc.nextDouble();
		lab = lab * 0.2;
		System.out.print("Insira a nota do Exame final: ");
		exam = sc.nextDouble();
		exam = exam * 0.5;
		
		notaFinal = exam+lab+ava;
		
		System.out.print("Média final: "+notaFinal);
		
		if(notaFinal>=8.0) {
			conceito = "A";
		}
		if(notaFinal>=7.0) {
			conceito = "B";
		}
		if(notaFinal>=6.0) {
			conceito = "C";
		}
		if(notaFinal>=5.0) {
			conceito = "D";
		}
		if(notaFinal<5.0) {
			conceito = "E";
		}
		
		System.out.println("O seu conceito foi: "+conceito);
		
		sc.close();
		
	}

}
