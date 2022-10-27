package teste;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a num 1: ");
		n1 = sc.nextDouble();
		System.out.print("Insira a num 2: ");
		n2 = sc.nextDouble();
		
		if(n1>n2) {
			System.out.print(n1+" é o maior");
		}
		if(n1<n2) {
			System.out.print(n2+" é o maior");
		}
		if(n1==n2) {
			System.out.print(n1+" e "+n2+" são iguais");
		}
		
		sc.close();
	}

}
