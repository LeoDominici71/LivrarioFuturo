package services;

public class DescontB implements desconto {
	
	private static final double B_DESC = 0.1;

	@Override
	public double desconto(double preco) {
		return preco * B_DESC;
	}

}
