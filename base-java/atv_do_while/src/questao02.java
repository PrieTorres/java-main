import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =1, numVei=0, numAci=0, maiorAci=0, medVAll=0, medAci2000=0, cid2000=0, cidMaiorAci=0;
		
		do {
			System.out.println("cidade - "+i);
			System.out.print("numero de veiculos de passeio: ");
			numVei = sc.nextInt();
			System.out.print("numero de acidentes de transito: ");
			numAci = sc.nextInt();
			
			if(numAci > maiorAci) {
				maiorAci = numAci;
				cidMaiorAci = i;
			}
			
			medVAll+=numVei;
			
			if(numVei < 2000) {
				cid2000+=1;
				medAci2000+=numAci;
			}
			
			i++;
			
		}while(i<=5);
		medVAll/=5;
		medAci2000/=cid2000;
		
		System.out.println("media de veiculos em todas as cidades: "+medVAll);
		System.out.println("maior indice de acidente: "+maiorAci);
		System.out.println("cidade com maior indice de acidente: "+cidMaiorAci);
		System.out.println("media de acidentes em cidades com menos de 2000 veiculos: "+medAci2000);
		
		
		sc.close();
	}

}
