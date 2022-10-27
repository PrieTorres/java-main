package teste;
import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2,n3, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a nota 1: ");
		n1 = sc.nextDouble();
		System.out.print("Insira a nota 2: ");
		n2 = sc.nextDouble();
		System.out.print("Insira a nota 3: ");
		n3 = sc.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("Media: "+media);
		
		if(media>=7.0) {
			System.out.println("Aprovado");
		}
		if(media>=3.0 && media<7) {
			System.out.println("Em exame");
			System.out.println("Nota necessária: "+(12-media));
		}
		if(media<3.0) {
			System.out.println("Reprovado");
		}
		
		sc.close();
		
	}

}
