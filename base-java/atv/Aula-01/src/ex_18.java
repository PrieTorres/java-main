import java.util.Scanner;

public class ex_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Base: ");
		int base = sc.nextInt();
		System.out.print("Altura: ");
		int altura = sc.nextInt();
		
		System.out.println("area: "+((base*altura)/2));
		
		sc.close();
	}

}
