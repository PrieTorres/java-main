import java.util.Scanner;
public class questaoL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Preco do Show: ");
		int Show = sc.nextInt();
		System.out.print("Preco ingresso: ");
		int Ingresso = sc.nextInt();
		
		double quantIngressos = Show/Ingresso;
		
		System.out.println("Quantidade de ingressos neessários: "+quantIngressos);
		sc.close();
	}

}
