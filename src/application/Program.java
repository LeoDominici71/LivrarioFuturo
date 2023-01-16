package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.DetalhePromocao;
import entities.Livro;
import entities.enums.TipoPromocaoEnum;
import exceptions.ExceptionDesconto;


public class Program {

	public static void main(String[] args) {
		

		// inserindo dados da livraria
		try {
			
			
		//seed para livro
		Livro livro = new Livro("Malala, a menina que queria ir para a escola", "Adriana Carranca", 21.9);
		Livro livro1 = new Livro("A revolução dos bichos: Um conto de fadas", "George Orwell", 8.5);
		Livro livro2 = new Livro("Amoras", "Emicida", 19.9);
		Livro livro3 = new Livro("Perigoso!", "Tim Warnes", 16.9);
		Livro livro4 = new Livro("O morro dos ventos uivantes", "Emily Brontë", 12.9);
		Livro livro5 = new Livro("Maus", "Art Spiegelman", 34.9);
		Livro livro6 = new Livro("Auto da compadecida", "Ariano Suassuna", 31.3);
		Livro livro7 = new Livro("Extraordinário", "R.J Palacio", 35.9);

		DetalhePromocao detalhePromocao = new DetalhePromocao();		
		// inserindo dados da promocao
		List<DetalhePromocao> list = new ArrayList<>();
		//seed para promocao
		list.add(new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/20"), livro,TipoPromocaoEnum.valueOf("B"), 10));
		list.add(new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/15"), livro1,TipoPromocaoEnum.valueOf("A"),5));
		list.add(new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/20"), livro2, TipoPromocaoEnum.valueOf("B"),10));
		list.add(new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/15"), livro3, TipoPromocaoEnum.valueOf("A"),5));
		list.add(new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/15"), livro4,TipoPromocaoEnum.valueOf("A"),5));
		list.add(new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/30"), livro5,TipoPromocaoEnum.valueOf("C"),15));
		list.add(new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/15"), livro6, TipoPromocaoEnum.valueOf("A"),5));
		list.add(new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/30"), livro7, TipoPromocaoEnum.valueOf("C"), 15));

		for (DetalhePromocao detalhePromocao2 : list) {
			System.out.println(detalhePromocao2);
			System.out.println("================================================================");
		}
		}
		catch(NullPointerException e) {
			System.out.println("A variavel nao pode ser nula");
		}
		catch (ExceptionDesconto e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage() );
		}
		

	}
}
