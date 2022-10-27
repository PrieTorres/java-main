import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int i = 2;
		int primo = 0;
		
		do {
		System.out.print("Número maior que 1:");
		num = sc.nextInt();
		} while(num <= 1);
		
		do {
			if(num%i==0) {
				primo = 0;//false, é divisivel
				System.out.println(i);
			}
			
			i++;
		}while(i<num);
		
		if(primo == 0) {
			System.out.println(num+" não é um número primo");
			
		}else {
			System.out.println(num+" é um número primo");
		}
		
		
		sc.close();
	}

}
