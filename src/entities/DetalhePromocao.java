package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.TipoPromocaoEnum;
import exceptions.ExceptionDesconto;

public class DetalhePromocao {

	private Date inicio;
	private Date fim;
	private Livro livro;
	private TipoPromocaoEnum tipo;
	private Integer pctPromocao;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public DetalhePromocao() {
		// TODO Auto-generated constructor stub
	}

	public DetalhePromocao(Date inicio, Date fim, Livro livro, TipoPromocaoEnum tipo, Integer pctPromocao) {
		this.inicio = inicio;
		this.fim = fim;
		this.livro = livro;
		this.tipo = tipo;
		this.pctPromocao = pctPromocao;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public TipoPromocaoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoPromocaoEnum tipo) {
		this.tipo = tipo;
	}

	public Integer getPctPromocao() {
		return pctPromocao;
	}

	public void setPctPromocao(Integer pctPromocao) {
		this.pctPromocao = pctPromocao;
	}

	public double desconto(TipoPromocaoEnum tipoPromocao, Livro livro, Integer desconto) {

		double sum = 0;
		if (tipoPromocao.valorTipoPromocao != 1 && tipoPromocao.valorTipoPromocao != 2
				&& tipoPromocao.valorTipoPromocao != 3) {
			throw new ExceptionDesconto("Tipo de promoçao inavalida!");
		} else {

			if (tipoPromocao.valorTipoPromocao == 2) {

				sum = livro.getPreco() - livro.getPreco() * desconto / 100;

			} else if (tipoPromocao.valorTipoPromocao == 1) {
				sum = livro.getPreco() - livro.getPreco() * desconto / 100;

			} else if (tipoPromocao.valorTipoPromocao == 3) {
				sum = livro.getPreco() - livro.getPreco() * desconto / 100;

			}
		}

		return sum;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Livro: " + livro.getNome());
		sb.append("\nAutor: " + livro.getAutor());
		sb.append("\nPreço original: " + livro.getPreco());
		sb.append("\nPreço final: " + desconto(tipo, livro, pctPromocao));
		sb.append("\nPorcentagem Aplicada:" + pctPromocao + "%");
		sb.append("\nData inicio: " + sdf.format(inicio));
		sb.append("\nData fim: " + sdf.format(fim));

		return sb.toString();
	}

}