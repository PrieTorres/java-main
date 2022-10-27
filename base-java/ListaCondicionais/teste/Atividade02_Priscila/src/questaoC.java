import java.util.Scanner;
public class questaoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero 1: ");
		int num1 = sc.nextInt();
		System.out.print("Numero 2: ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			System.out.print("Resto da divisão: "+(num1%num2));
		}else {
			System.out.print("não pode ser zero");
		}
		
		sc.close();
	}

}
