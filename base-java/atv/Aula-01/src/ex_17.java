import java.util.Scanner;
import java.lang.Math;

public class ex_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Raio: ");
		int raio = sc.nextInt();
		
		
		
		System.out.println("area: "+((raio*raio)*Math.PI));
		System.out.println("perimetro: "+(2*Math.PI*raio));
		
		sc.close();
	}

}
