import java.util.Scanner;

public class quest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod_prod, peso_prod, cod_pais, imposto;
		double valor_total, preco_prod, imposto_prod;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("qual o código do seu produto? ");
		cod_prod = sc.nextInt();
		
		System.out.print("qual o código do seu pais? ");
		cod_pais = sc.nextInt();
		
		System.out.print("qual o peso do produto(gramas)? ");
		peso_prod = sc.nextInt();
		
		
		
		switch(cod_pais) {
			case 1:
				imposto = 0;
				break;
			case 2:
				imposto = 15;
				break;
			case 3:
				imposto = 25;
				break;
			default:
				imposto = 50;
		}
		
		switch(cod_prod) {
			case 1,2,3,4:
				preco_prod = peso_prod*10;
				imposto_prod = (preco_prod*imposto)/100;
				valor_total = preco_prod+imposto_prod;
				break;
				
			case 5,6,7:
				preco_prod = peso_prod*25;
				imposto_prod = (preco_prod*imposto)/100;
				valor_total = preco_prod+imposto_prod;
				break;
				
			case 8,9,10:
				preco_prod = peso_prod*35;
				imposto_prod = (preco_prod*imposto)/100;
				valor_total = preco_prod+imposto_prod;
				break;
				
			default:
				preco_prod = peso_prod*10;
				imposto_prod = (preco_prod*imposto)/100;
				valor_total = preco_prod+imposto_prod;
				break;
		}
		
		System.out.println("peso do produto: "+peso_prod);
		System.out.println("preço do produto: "+preco_prod);
		System.out.println("imposto cobrado: "+imposto+"%");
		System.out.println("valor do imposto: "+imposto_prod);
		System.out.println("------------------------------------");
		System.out.println("valor total: "+valor_total);
		
		
		
		sc.close();
		

	}

}
