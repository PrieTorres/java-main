package objetosss;

public class Conta {
	public String id;
	private double saldo;
	private int agencia, numero;
	static int numConta = 0;
	
	public Conta(int numero,int agencia) {
		this.agencia = agencia;
		this.numero = numero;
		this.id = "conta"+numConta;
		
		numConta++;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void receberSalario(double salario) {
		this.saldo += salario;
		System.out.println("Salário depositado!!! :)");
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("valor depositado: "+valor);
	}
	
	public void sacarValor (double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
		}else {
			System.out.println("saque não realizado porque você é pobre");
		}
	}
	
	public void transferirDinheiro(Conta contaQueTranfere, Conta contaQueRecebe, double valor) {
		System.out.println(
		"\n valor a ser transferido: "+valor
		+"\n seu saldo: "+contaQueTranfere.saldo
		+"\n saldo destinatario: "+contaQueRecebe.saldo
		);
		
		if(contaQueTranfere.saldo>=valor) {
			contaQueTranfere.saldo -= valor;
			contaQueRecebe.saldo += valor;
			System.out.println(
			"\n !!!VALOR TRANSFERIDO COM SUCESSO!!! \n"
			+"\n valor transferido: "+valor
			+"\n seu saldo atual: "+contaQueTranfere.saldo
			+"\n saldo destinatario atual: "+contaQueRecebe.saldo
			);
		}else {
			System.out.println("tranferencia não realizada porque você não tem dinheiro");
		}
	}


}
