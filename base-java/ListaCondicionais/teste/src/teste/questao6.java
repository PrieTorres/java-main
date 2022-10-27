package teste;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a num 1: ");
		n1 = sc.nextDouble();
		
		if(n1 % 2==0) {
			System.out.println(n1+" É par!");
		}
		if(n1 % 2 != 0) {
			System.out.println(n1+" É impar!");
		}
		
		sc.close();
	}

}
