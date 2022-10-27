import java.util.Scanner;
public class ex_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro valor: ");
		int x = sc.nextInt();
		System.out.print("Segundo valor: ");
		int y = sc.nextInt();
		System.out.print("Media: "+((x+y)/2));
		
		sc.close();
	}

}
