import java.util.Scanner;
public class questaoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero 1: ");
		int num1 = sc.nextInt();
		System.out.print("Numero 2: ");
		int num2 = sc.nextInt();
		System.out.print("Numero 3: ");
		int num3 = sc.nextInt();
		System.out.print("Numero 4: ");
		int num4 = sc.nextInt();
		System.out.print("Numero 5: ");
		int num5 = sc.nextInt();
		double soma = num1+num2+num3+num4+num5;
		
		System.out.print("Resultado: "+(soma/8));
		sc.close();
	}

}
