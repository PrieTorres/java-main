
public class Conta {
	/*todos os atributos vão ter 0 como default, mas podem ter outros padroes pre definidos*/
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	public void depositar(double valor){ //void quer dizer que não tem retorno
		// pode usar com ou sem public
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
			destino.depositar(valor); //destino.saldo += valor;
			this.sacar(valor); //this.saldo -= valor;
			return true; // return vai parar o código aqui, não executando oque vem a seguir
		}
		System.out.println("a transferencia não foi realizada");
		return false;
	}

}
