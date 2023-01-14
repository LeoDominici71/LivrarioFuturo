package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TipoPromocao;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<TipoPromocao> list = new ArrayList<>();

		System.out.println("entre o numero de livros que serao atualizados");
		int n = sc.nextInt();
		for (int i = n; i <= n; i++) {

		}

	}
}
