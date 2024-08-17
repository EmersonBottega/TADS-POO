package Brinquedos;

public class TestaBrinquedo {

	public static void main(String[] args) {
		Brinquedo b1 = new Brinquedo();
		Brinquedo b2 = new Brinquedo();
		
		b1.setNome("Amoeba");
		b1.setFaixaEtaria("acima de 12");
		b1.setPreco(13.99f);
		
		b1.mostrar();
		
		
		b2.setNome("Boneca");
		b2.setFaixaEtaria("6 a 10");
		b2.setPreco(24.99f);
		
		b2.mostrar();
	}

}
