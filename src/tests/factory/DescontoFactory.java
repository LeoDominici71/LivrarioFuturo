package tests.factory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.DetalhePromocao;
import entities.Livro;
import entities.enums.TipoPromocaoEnum;

public class DescontoFactory {
	public static final int PctDescontoA = 5;
	public static final int PctDescontoB = 10;
	public static final int PctDescontoC = 15;

	public static Livro createEmptyLivro(double price) {
		return new Livro("X", "X", price);
	}

}
