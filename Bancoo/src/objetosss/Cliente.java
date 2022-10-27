package objetosss;

import java.util.Scanner;

public class Cliente {
	Scanner sc = new Scanner(System.in);
		
	private String endereco, cpf, profissao;
	public String nome;
	public Conta conta;
	private double renda;
	public static int numClientes = 0; 
	public static Cliente[] AllContas = new Cliente[1000];
	
	public void criarCliente() {
		String nome, endereco, cpf, profissao;
		double renda;
		
		System.out.print("nome do cliente: ");
		nome = sc.nextLine();
		System.out.print("endereço do cliente: ");
		endereco = sc.nextLine();
		System.out.print("cpf do cliente: ");
		cpf = sc.nextLine();
		System.out.print("profissao do cliente: ");
		profissao = sc.nextLine();
		System.out.print("renda do cliente: ");
		renda = sc.nextDouble();
		
		this.criarConta();
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.profissao = profissao;
		this.renda = renda;
		
		Cliente cliente = new Cliente();
		cliente.cadastrarDados(nome, endereco, cpf, profissao, renda, this.conta);
		AllContas[numClientes] = cliente;
		numClientes++;
	}
	
	private void cadastrarDados(String nome, String endereco, String cpf, String profissao, double renda, Conta conta) {
		this.conta = conta;
		this.cpf = cpf;
		this.endereco = endereco;
		this.nome = nome;
		this.profissao = profissao;
		this.renda = renda;
	}
	
	public void mostrarDadosCliente() {
		System.out.println(
		"\nNome: "+this.nome
		+"\nEndereço: "+this.endereco
		+"\nCPF: "+this.cpf
		+"\nProfissao: "+this.profissao
		//+"\nConta: "+this.conta
		);
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public int getRenda() {
		return (int) this.renda;
	}
	
	public void criarConta() {
		System.out.print("numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("agencia da conta: ");
		int agencia = sc.nextInt();
		this.conta = new Conta(agencia, numero);
		this.conta.receberSalario(this.renda);
	}
	
	public void mostrarDadosDaConta() {
		System.out.println(
		"\n Agencia: "+this.conta.getAgencia()
		+"\n Numero: "+this.conta.getNumero()
		+"\n saldo: "+ this.conta.getSaldo()
		);
	}
	
	static public Cliente buscarClientePorCPF(String cpf) {
		Cliente login = null;
		
		for(int i=0; i <= (Cliente.numClientes - 1); i++) {
			String cpfTemp = AllContas[i].getCPF();
			
			if(cpfTemp.equals(cpf)) {
				System.out.println("login realizado com sucesso");
				login = AllContas[i];
				System.out.println("seus dados -->");
				login.mostrarDadosCliente();
				login.mostrarDadosDaConta();
			}else {
				System.out.println("cliente não encontrado");
			}
			
		}
		return login;
		
	}

}
