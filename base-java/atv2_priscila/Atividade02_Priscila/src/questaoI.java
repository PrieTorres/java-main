import java.util.Scanner;
public class questaoI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double horasTrabalhadas, horasExtras;
		double salarioMin;
		Scanner sc = new Scanner(System.in);
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		System.out.print("Horas extras: ");
		horasExtras = sc.nextDouble();
		System.out.print("Salrio minimo: ");
		salarioMin = sc.nextDouble();
		
		double valorHoras = horasTrabalhadas*(salarioMin/6);
		double valorExtras = horasExtras*(salarioMin/3);
		
		double salarioFinal = valorHoras+valorExtras;
		
		System.out.print("Salario Final: "+salarioFinal);
		sc.close();
	}

}
