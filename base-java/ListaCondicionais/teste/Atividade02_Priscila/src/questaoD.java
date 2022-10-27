import java.util.Scanner;
public class questaoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("preco atual da gasolina: ");
		double gasolina = sc.nextDouble();
		
		System.out.print("Novo preço da gasolina: "+(gasolina*1.10));
		sc.close();
	}

}
