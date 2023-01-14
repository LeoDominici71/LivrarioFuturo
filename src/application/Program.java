package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Livro;
import entities.TipoPromocao;
import entities.enums.TipoPromocaoEnum;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// inserindo dados da livraria
		Livro livro = new Livro("Malala, a menina que queria ir para a escola", "Adriana Carranca", 21.9,
				TipoPromocaoEnum.valueOf("B"));
		Livro livro1 = new Livro("A revolução dos bichos: Um conto de fadas", "George Orwell", 8.5,
				TipoPromocaoEnum.valueOf("A"));
		Livro livro2 = new Livro("Amoras", "Emicida", 19.9, TipoPromocaoEnum.valueOf("B"));
		Livro livro3 = new Livro("Perigoso!", "Tim Warnes", 16.9, TipoPromocaoEnum.valueOf("A"));
		Livro livro4 = new Livro("O morro dos ventos uivantes", "Emily Brontë", 12.9, TipoPromocaoEnum.valueOf("A"));
		Livro livro5 = new Livro("Maus", "Art Spiegelman", 34.9, TipoPromocaoEnum.valueOf("C"));
		Livro livro6 = new Livro("Auto da compadecida", "Ariano Suassuna", 31.3, TipoPromocaoEnum.valueOf("A"));
		Livro livro7 = new Livro("Extraordinário", "R.J Palacio", 35.9, TipoPromocaoEnum.valueOf("C"));

		// inserindo dados da promocao
		TipoPromocao promocao = new TipoPromocao(sdf.format("2023/01/10"), sdf.format("2023/01/20"), livro);
		TipoPromocao promocao1 = new TipoPromocao(sdf.format("2023/01/10"), sdf.format("2023/01/15"), livro1);
		TipoPromocao promocao2 = new TipoPromocao(sdf.format("2023/01/10"), sdf.format("2023/01/20"), livro2);
		TipoPromocao promocao3 = new TipoPromocao(sdf.format("2023/01/10"), sdf.format("2023/01/15"), livro3);
		TipoPromocao promocao4 = new TipoPromocao(sdf.format("2023/01/10"), sdf.format("2023/01/15"), livro4);
		TipoPromocao promocao5 = new TipoPromocao(sdf.format("2023/01/10"), sdf.format("2023/01/30"), livro5);
		TipoPromocao promocao6 = new TipoPromocao(sdf.format("2023/01/10"), sdf.format("2023/01/15"), livro6);
		TipoPromocao promocao7 = new TipoPromocao(sdf.format("2023/01/10"), sdf.format("2023/01/30"), livro7);

	}
}
