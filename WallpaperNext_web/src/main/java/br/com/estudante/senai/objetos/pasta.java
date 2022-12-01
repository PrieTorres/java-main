package br.com.estudante.senai.objetos;

import javax.servlet.annotation.WebServlet;

public class pasta {
	
	Foto[] fotos = new Foto[100];
	public String nome;
	static public int quantidadePastas=0;
	public String descricao;
	public String criador; 
	
	public pasta(String nome, String descricao, String criador) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.criador = criador;
		this.quantidadePastas++;
	}
	
	

}
