import java.util.Scanner;
public class questaoK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("horas: ");
		int horas = sc.nextInt();
		System.out.print("minutos: ");
		int minutos = sc.nextInt();
		
		int horasEmMin = horas*60;
		System.out.println("Horas em Minutos: "+horasEmMin);
		
		int totalMin = horasEmMin+minutos;
		System.out.println("Total de minutos: "+totalMin);
		
		int seconds = minutos*60;
		System.out.println("Minutos em segundos: "+seconds);
		
		sc.close();
	}

}
