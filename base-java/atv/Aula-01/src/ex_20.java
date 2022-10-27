import java.util.Scanner;

public class ex_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Idade em anos: ");
		int anos = sc.nextInt();
		System.out.print("Idade em dias: ");
		int dias = sc.nextInt();
		System.out.print("Idade em meses: ");
		int mes = sc.nextInt();
		
		int diasTotal = anos*365+mes*30+dias;
		
		System.out.print("idade em dias: "+ diasTotal);
		
		sc.close();
	}

}
