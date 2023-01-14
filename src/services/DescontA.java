package services;

public class DescontA implements desconto {
	
	private static final double A_DESC = 0.05;

	@Override
	public double desconto(double preco) {
		return preco * A_DESC;
	}
	
	

	

	

	
	
}
