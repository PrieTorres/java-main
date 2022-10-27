import java.util.Scanner;
public class questaoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Salario minimo: ");
		double salarioMin = sc.nextDouble();
		System.out.print("Salario funcionário: ");
		double salarioFunc = sc.nextDouble();
		double quantSalarios = salarioFunc/salarioMin;
		
		System.out.print("Quantidade de salarios minimos equivalente: "+(quantSalarios));
		sc.close();
	}

}
