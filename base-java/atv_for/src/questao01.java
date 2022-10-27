import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("informe o número que voce deseja ver a tabuada: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		
		sc.close();

	}

}
