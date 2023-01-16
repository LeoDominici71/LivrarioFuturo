package tests.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import entities.DetalhePromocao;
import entities.Livro;
import entities.enums.TipoPromocaoEnum;
import tests.factory.DescontoFactory;

public class DescontoTests {
	
	@Test
	public void DescontoTestingA() {
		
		double price = 31;
		double expectedValue = 29.45;
		Livro livroTest = DescontoFactory.createEmptyLivro(price);
		DetalhePromocao detP = new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/15"), livroTest,TipoPromocaoEnum.valueOf("A"), DescontoFactory.PctDescontoA);
		List<DetalhePromocao> list = new ArrayList<>();
		detP.desconto(detP.getTipo(),livroTest , detP.getPctPromocao());
		Assertions.assertEquals(expectedValue, detP.desconto(detP.getTipo(), livroTest, detP.getPctPromocao()));
		
	} 
	
	@Test
	public void DescontoTestingB() {
		
		double price = 31;
		double expectedValue = 27.9;
		Livro livroTest = DescontoFactory.createEmptyLivro(price);
		DetalhePromocao detP = new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/20"), livroTest,TipoPromocaoEnum.valueOf("B"), DescontoFactory.PctDescontoB);
		List<DetalhePromocao> list = new ArrayList<>();
		detP.desconto(detP.getTipo(),livroTest , detP.getPctPromocao());
		Assertions.assertEquals(expectedValue, detP.desconto(detP.getTipo(), livroTest, detP.getPctPromocao()));
		
	} 
	
	@Test
	public void DescontoTestingC() {
		
		double price = 31;
		double expectedValue = 26.35;
		Livro livroTest = DescontoFactory.createEmptyLivro(price);
		DetalhePromocao detP = new DetalhePromocao(new Date("2023/01/10"), new Date("2023/01/30"), livroTest,TipoPromocaoEnum.valueOf("C"), DescontoFactory.PctDescontoC);
		List<DetalhePromocao> list = new ArrayList<>();
		detP.desconto(detP.getTipo(),livroTest , detP.getPctPromocao());
		Assertions.assertEquals(expectedValue, detP.desconto(detP.getTipo(), livroTest, detP.getPctPromocao()));
		
	} 

}
