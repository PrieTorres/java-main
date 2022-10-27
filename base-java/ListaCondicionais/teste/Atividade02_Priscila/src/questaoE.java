import java.util.Scanner;
public class questaoE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Salario Fixo: ");
		int salarioFixo = sc.nextInt();
		System.out.print("Valor das vendas: ");
		int vendas = sc.nextInt();
		
		double resultado = salarioFixo+(vendas*0.04);
		
		System.out.print("Salario final: "+resultado);
		sc.close();
	}

}
