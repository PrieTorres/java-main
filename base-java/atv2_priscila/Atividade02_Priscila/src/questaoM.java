import java.util.Scanner;
public class questaoM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Salario Minimo: ");
		int salarioMin = sc.nextInt();
		System.out.print("quantidade de quilowatts: ");
		int quantKWatts = sc.nextInt();
		
		int kwattsEnergia = salarioMin/6;
		System.out.println("Valor do quilowatts: "+kwattsEnergia);
		double residencia = kwattsEnergia*quantKWatts;
		System.out.println("Valor do a ser pago: "+residencia);
		double valorPago = residencia*0.82;
		System.out.println("Valor do a ser pago com desconto: "+valorPago);
		
		sc.close();
	}

}
