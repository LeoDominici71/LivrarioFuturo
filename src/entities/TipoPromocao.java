package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TipoPromocao {

	private Date inicio;
	private Date fim;
	private List<Livro> livro = new ArrayList<>();

	public TipoPromocao() {
	}

	public TipoPromocao(Date inicio, Date fim, List<Livro> livro) {
		this.inicio = inicio;
		this.fim = fim;
		this.livro = livro;
	}

	public Date getinicio() {
		return inicio;
	}

	public void setinicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getfim() {
		return fim;
	}

	public void setfim(Date fim) {
		this.fim = fim;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	@Override
	public String toString() {
		return "TipoPromocao [Inicio=" + inicio + ", Fim=" + fim + ", livro=" + livro + "]";
	}

}
