package entities;


public class Livro {

	private String nome;
	private String autor;
	private Double preco;

	public Livro() {

	}

	public Livro(String nome, String autor, Double preco) {
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
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

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", preco=" + preco + "]";
	}
	
	
	
}

