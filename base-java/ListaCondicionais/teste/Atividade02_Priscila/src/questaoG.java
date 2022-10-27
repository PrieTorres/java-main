import java.util.Scanner;
public class questaoG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero: ");
		int num1 = sc.nextInt();
		int i = 1;
		while(i <= 10) {
			System.out.println(num1+" X "+i+" = "+(num1*i));
			i = i+1;
		}
		
		
		sc.close();
	}

}
