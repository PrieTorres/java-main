package objetos;

public class pasta {
	
	Foto[] fotos = new Foto[100];
	public String nome;
	static public int quantidadePastas=0;
	public String descricao;
	
	public pasta(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidadePastas++;
	}
	
	

}
