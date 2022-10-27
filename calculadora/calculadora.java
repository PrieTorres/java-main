package calculadora;

import java.util.Scanner;

public class calculadora {
	
	static Scanner sc = new Scanner(System.in);
	
	static public double soma (double num1, double num2) {
		if(num2==0) {
			System.out.print("informe o valor a ser somado: ");
			num2 = sc.nextDouble();
		}
		return (num1+num2);
	}
	
	static public double subtracao (double num1, double num2) {
		if(num2==0) {
			System.out.print("informe o valor a ser subtraido: ");
			num2 = sc.nextDouble();
		}
		return (num1-num2);
	}
	
	static public double multiplicacao (double num1, double num2) {
		if(num2==0) {
			System.out.print("informe o valor a ser multiplicado: ");
			num2 = sc.nextDouble();
		}
		return (num1*num2);
	}
	
	static public double divisao (double num1, double num2) {
		if(num2==0) {
			System.out.print("informe o valor a ser dividido: ");
			num2 = sc.nextDouble();
		}
		return (num1/num2);
	}
	
	static public double potenciacao (double num1, double num2) {
		if(num2==0) {
			System.out.print("informe o valor qua vai definir a que numero o numero anterior será potenciado: ");
			num2 = sc.nextDouble();
		}
		return (Math.pow(num1, num2));
	}
	
	static public double raiz (double num1) {
		return (Math.sqrt(num1));
	}
	
	static public double porcentagem (double num1, double num2) {
		if(num2==0) {
			System.out.print("informe o valor que o numero anterior sera dividido: ");
			num2 = sc.nextDouble();
		}
		return (num1*num2/100);
	}

}
