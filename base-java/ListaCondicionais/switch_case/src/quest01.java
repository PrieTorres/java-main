import java.util.Scanner;

public class quest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod;
		double salario;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("qual o código de sua função? ");
		cod = sc.nextInt();
		
		System.out.print("qual o seu salário atual? ");
		salario = sc.nextDouble();
		
		switch(cod){
			case 1: 
				salario = salario*1.5;
				System.out.println("o seu cargo é Escriturário");
				System.out.print("o aumento foi de 50%");
				System.out.println("o seu novo salário é: "+salario);
				break;
				
			case 2: 
				salario = (salario*135)/100;
				System.out.println("o seu cargo é Secretário");
				System.out.print("o aumento foi de 35%");
				System.out.println("o seu novo salário é: "+salario);
				break;
				
			case 3: 
				salario = (salario*12)/10;
				System.out.println("o seu cargo é Caixa");
				System.out.print("o aumento foi de 20%");
				System.out.println("o seu novo salário é: "+salario);
				break;
				
			case 4: 
				salario = salario*1.1;
				System.out.println("o seu cargo é Gerente");
				System.out.print("o aumento foi de 10%");
				System.out.println("o seu novo salário é: "+salario);
				break;
			
			case 5: 
				System.out.println("o seu cargo é Diretor");
				System.out.print("o aumento foi de 0%");
				System.out.println("o seu novo salário é: "+salario);
				break;
				
				
		}
		
		sc.close();
		

	}

}
