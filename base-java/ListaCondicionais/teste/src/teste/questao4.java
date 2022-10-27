package teste;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a num 1: ");
		n1 = sc.nextDouble();
		System.out.print("Insira a num 2: ");
		n2 = sc.nextDouble();
		System.out.print("Insira a num 3: ");
		n3 = sc.nextDouble();
		
		if(n1>n2 && n1>n3 && n2>n3) {
			System.out.print(n1+" "+n2+" "+n3);
		}
		if(n1>n2 && n1>n3 && n2<n3) {
			System.out.print(n1+" "+n3+" "+n2);
		}
		if(n1<n2 && n1>n3 && n2>n3) {
			System.out.print(n2+" "+n1+" "+n3);
		}
		if(n1<n2 && n1<n3 && n2>n3) {
			System.out.print(n2+" "+n3+" "+n1);
		}
		if(n3>n1 && n3>n2 && n2>n1) {
			System.out.print(n3+" "+n2+" "+n1);
		}
		if(n3>n1 && n3>n2 && n2<n1) {
			System.out.print(n3+" "+n1+" "+n2);
		}
		
		sc.close();
	}

}
