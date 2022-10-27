import java.util.Scanner;
public class questaoJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("dinheiros: ");
		double dinheiro = sc.nextDouble();
		
		System.out.println("dolar australiano: "+(dinheiro/3.54));
		System.out.println("BitCoin: "+(dinheiro/194626.91));
		System.out.println("libra asterlina: "+(dinheiro/6.27));
		sc.close();
	}

}
