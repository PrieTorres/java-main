import java.util.Scanner;
public class questaoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("peso da ração(kg): ");
		int racao = sc.nextInt();
		System.out.print("ração por gato(g): ");
		int gatoComeu = sc.nextInt();
		
		int racaoG = racao*1000;
		
		double racaoSobrante = (racaoG-(gatoComeu*2*5))/1000;
				
		System.out.print("O quanto de racao que sobra após 5 dias(kg): "+racaoSobrante);
		sc.close();
	}

}
