package Executavel;

import java.util.Scanner;
import objetosss.*;

public class main {

	public static void main(String[] args) {
		int opcao=999, numCliente=0;
		Cliente[] arrayClientes = new Cliente[100];
		
		Scanner sc = new Scanner (System.in); 
		
		while(opcao != 0) {
			System.out.println("Opções do Banco Baco do Blues, você feliz a gente blues"
			+"\n 0 - finalizar atendimento"
			+"\n 1 - cadastra cliente(conta é criada junto, salario automaticamente depositado)"
			+"\n 2 - listar clientes"
			+ "\n 3 - opcoes do cliente"
			);
			opcao = sc.nextInt();
					
			if(opcao == 1) {
				Cliente cliente = new Cliente();
				cliente.criarCliente();
				arrayClientes[numCliente] = cliente;
				numCliente++;
			}else if(opcao == 2) {
				for(int i=0; i <= (Cliente.numClientes - 1); i++) {
					Cliente.AllContas[i].mostrarDadosCliente();
				}
			}else if(opcao == 3) {
				
				String cpfLogin = "";
				
				while(cpfLogin.length() <1) {
					System.out.println("informe o seu cpf: ");
					cpfLogin = sc.nextLine();
				}
				
				System.out.println("cpf informado: "+cpfLogin);
				
				Cliente login = Cliente.buscarClientePorCPF(cpfLogin);
				
				
				
				while(login != null) {
					
					System.out.println("Opções cliente: "
							+"\n 1 - depositar valor"
							+"\n 2 - sacar valor"
							+"\n 3 - tranferir conta");
							int opcCliente = sc.nextInt();
					
					if(opcCliente == 1) {
						System.out.print("insira o valor a ser depositado: ");
						double valor = sc.nextDouble();
						login.conta.depositar(valor);
						
						break;
					}else if(opcCliente == 2) {
						System.out.print("insira o valor a ser sacado: ");
						double valor = sc.nextDouble();
						login.conta.sacarValor(valor);
						
						break;
					}else if(opcCliente == 3) {
						System.out.print("insira o valor a ser transferido da sua conta: ");
						double valor = sc.nextDouble();
						
						Cliente contaDestinatario = null;
						while(contaDestinatario == null) {
							System.out.print("insira o cpf de para quem você quer transferir o valor:");
							String cpfDestinatario = sc.nextLine();
							
							contaDestinatario = Cliente.buscarClientePorCPF(cpfDestinatario);
						}
						
						login.conta.transferirDinheiro(login.conta, contaDestinatario.conta, valor);
						
						break;
					}
					
				}
				
			}
			
			System.out.println("Feito por Priscila, Maria e Letícia ;) ");
		}
		
		sc.close();
		

	}

}
