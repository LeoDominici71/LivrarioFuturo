package services;

public class DescontC implements desconto {
	private static final double C_DESC = 0.15;

	@Override
	public double desconto(double preco) {
		return preco * C_DESC;
	}

}
