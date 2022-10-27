package teste;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2, n3, n4;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a num 1: ");
		n1 = sc.nextDouble();
		System.out.println("Insira a num 2: ");
		n2 = sc.nextDouble();
		if(n1<n2) {
			System.out.println("num1 deve ser maior que num2");
			System.out.println("Insira a num 2: ");
			n2 = sc.nextDouble();
		}
		System.out.println("Insira a num 3: ");
		n3 = sc.nextDouble();
		if(n2<n3) {
			System.out.println("num2 deve ser maior que num3");
			System.out.println("Insira a num 2: ");
			n3 = sc.nextDouble();
		}
		System.out.println("Insira a num 4: ");
		n4 = sc.nextDouble();
		
		
		if(n4>n1) {
			System.out.print(n3+" "+n2+" "+n1+" "+n4);
		}
		if(n4<n1 && n4>n2) {
			System.out.print(n3+" "+n2+" "+n4+" "+n1);
		}
		if(n4<n2 && n4>n3) {
			System.out.print(n3+" "+n4+" "+n2+" "+n1);
		}

		if(n4<n3) {
			System.out.print(n4+" "+n3+" "+n2+" "+n1);
		}
		
		sc.close();
	}

}
