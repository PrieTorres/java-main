import java.util.Scanner;
public class questaoH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, conta1, conta2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Salario: ");
		salario = sc.nextInt();
		System.out.print("Conta 1: ");
		conta1 = sc.nextInt();
		System.out.print("Conta 2: ");
		conta2 = sc.nextInt();
		
		conta1 = conta1 * 0.95;
		conta2 = conta2 * 0.95;
		
		salario = salario-conta1-conta2;
		
		System.out.print("Salario com descontos: "+salario);
		sc.close();
	}

}
