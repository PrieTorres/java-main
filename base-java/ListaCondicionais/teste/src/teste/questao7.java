package teste;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int I;
		double A,B,C;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o vaor de I: ");
		I = sc.nextInt();
		System.out.println("Insira o vaor de A: ");
		A = sc.nextDouble();
		System.out.println("Insira o vaor de B: ");
		B = sc.nextDouble();
		System.out.println("Insira o vaor de C: ");
		C = sc.nextDouble();
		
		if(I == 1) {
			
			if(A>B && A>C && B>C) {
				System.out.println(A+" "+B+" "+C);
			}
			if(A>B && A>C && B<C) {
				System.out.println(A+" "+C+" "+B);
			}
			if(B>A && B>C && C>A) {
				System.out.println(B+" "+C+" "+A);
			}
			if(B>A && B>C && C<A) {
				System.out.println(B+" "+A+" "+C);
			}
			if(C>A && C>B && A>B) {
				System.out.println(C+" "+A+" "+B);
			}
			if(C>A && C>B && A<B) {
				System.out.println(C+" "+B+" "+A);
			}
		}
		
		if(I == 2) {
			if(A>B && A>C && B>C) {
				System.out.println(C+" "+B+" "+A);
			}
			if(A>B && A>C && B<C) {
				System.out.println(B+" "+C+" "+A);
			}
			if(B>A && B>C && C>A) {
				System.out.println(A+" "+C+" "+B);
			}
			if(B>A && B>C && C<A) {
				System.out.println(C+" "+A+" "+B);
			}
			if(C>A && C>B && A>B) {
				System.out.println(B+" "+A+" "+C);
			}
			if(C>A && C>B && A<B) {
				System.out.println(A+" "+B+" "+C);
			}
			
		}
		if(I == 3) {
			if(A>B && A>C && B>C) {
				System.out.println(C+" "+A+" "+B);
			}
			if(A>B && A>C && B<C) {
				System.out.println(B+" "+A+" "+C);
			}
			if(B>A && B>C && C>A) {
				System.out.println(A+" "+B+" "+C);
			}
			if(B>A && B>C && C<A) {
				System.out.println(C+" "+B+" "+A);
			}
			if(C>A && C>B && A>B) {
				System.out.println(B+" "+C+" "+A);
			}
			if(C>A && C>B && A<B) {
				System.out.println(A+" "+C+" "+B);
			}
		}
		
		sc.close();
	}

}
