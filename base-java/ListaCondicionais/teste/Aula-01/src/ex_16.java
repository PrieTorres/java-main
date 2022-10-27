import java.util.Scanner;

public class ex_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Base: ");
		int base = sc.nextInt();
		System.out.print("Altura: ");
		int altura = sc.nextInt();
		
		
		System.out.println("area: "+(base*altura));
		System.out.println("perimetro: "+(2*base+2*altura));
		
		sc.close();
	}

}
