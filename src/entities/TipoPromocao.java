package entities;

public class TipoPromocao {

	private String inicio;
	private String fim;
	private Livro livro;

	public TipoPromocao() {
	}

	public TipoPromocao(String inicio, String fim, Livro livro) {
		this.inicio = inicio;
		this.fim = fim;
		this.livro = livro;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFim() {
		return fim;
	}

	public void setFim(String fim) {
		this.fim = fim;
	}

	public Livro getLivro() {
		return livro;
	}

	@Override
	public String toString() {
		return "TipoPromocao [inicio=" + inicio + ", fim=" + fim + ", livro=" + livro + "]";
	}

}
