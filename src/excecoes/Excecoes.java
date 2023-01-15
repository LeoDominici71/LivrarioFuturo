package excecoes;

public class Excecoes extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public Excecoes(String msg) {
		super(msg);
	}

}
