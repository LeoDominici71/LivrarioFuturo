package entities;

import entities.enums.TipoPromocaoEnum;

public class Livro {

	private String nome;
	private String autor;
	private Double preco;
	private TipoPromocaoEnum tipo;

	public Livro() {

	}

	public Livro(String nome, String autor, Double preco, TipoPromocaoEnum tipo) {
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public TipoPromocaoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoPromocaoEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", preco=" + preco + ", tipo=" + tipo + "]";
	}

}
