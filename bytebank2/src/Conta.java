
public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	Cliente titular = new Cliente();
	
	public void depositar(double valor){ 
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;	
		}else {
			System.out.println("saldo insuficiente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			destino.depositar(valor); 
			this.sacar(valor); 
			return true; 
		}
		System.out.println("a transferencia não foi realizada");
		return false;
	}

}
