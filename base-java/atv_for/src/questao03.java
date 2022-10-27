import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/*
		 *  trabalhadores que fazem até 30 peças por mês - classe 1;
			trabalhadores que fazem de 31 a 50 peças por mês - classe 2;
			trabalhadores que fazem mais de 50 peças por mês - classe 3;
			A classe 1 recebe salário mínimo. A classe 2 recebe salário mínimo mais 3% desse salário por peça, acima das 30 peças iniciais. A classe 3 recebe salário mínimo mais 5% desse salário por peça, acima das 30 peças iniciais.
			Faça um programa que receba o número do operário, o número de peças fabricadas no mês, o sexo do operário, e que também calcule e mostre:
			o número do operário e seu salário;
			o total da folha de pagamento da fábrica;
			o número total de peças fabricadas no mês;
			a média de peças fabricadas pelos homens;
			a média de peças fabricadas pelas mulheres;
			o número de operário ou operária de maior salário.
			A fábrica possui 15 operários.
		 * 
		 * */
		
		double salario, salarioOper=0, maxSal=0, allSal=0;
		int pecasMes, numOper=0, homP=0, mulP=0, allP=0, numH=0, numM=0,sexo;
		System.out.print("salario minimo: ");
		salario = sc.nextDouble();
		
		
		for(int i=1;i<=15;i++) {
			System.out.print("quantidade de peças fabricadas por mes: ");
			pecasMes = sc.nextInt();
			System.out.print("sexo do funcionário (1 é Homem, 2 Mulher): ");
			sexo = sc.nextInt();
			
			allP+=pecasMes;
			
			if(sexo==1) {
				homP+=pecasMes;
				numH++;
			}
			if(sexo==2) {
				mulP+=pecasMes;
				numM++;
			}
			
			if(pecasMes <= 30) {
				salarioOper = salario;
				
			}else if(pecasMes <= 50) {
				salarioOper = salario;
				salarioOper+=(salarioOper*0.03*pecasMes);
				
			}else if(pecasMes > 50) {
				salarioOper = salario;
				salarioOper+=(salarioOper*0.03*pecasMes);
			}
			
			if(maxSal < salarioOper) {
				maxSal = salarioOper;
				numOper = i;
			}
			
			allSal+=salarioOper;
			
			System.out.println("número do operario: "+i);
			System.out.println("salario: "+salarioOper);
		}
		
		System.out.println("total dos salarios: "+ allSal);
		System.out.println("numero total de peças: "+allP);
		System.out.println("media peças produzidas por homens: "+(homP/numH));
		System.out.println("media peças produzidas por mulheres: "+(mulP/numM));
		System.out.println("maior salario: "+maxSal);
		System.out.println("número do operário de maior salário: "+numOper);
		
		sc.close();

	}

}
