package Brinquedos;

public class Brinquedo {
	private String nome;
	private String faixaEtaria;
	private float preco;
	
	//getters and setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		
		if (faixaEtaria.equals("0 a 2") || faixaEtaria.equals("3 a 5") || faixaEtaria.equals("6 a 10") || faixaEtaria.equals("acima de 10")) {
            this.faixaEtaria = faixaEtaria;
        } else {
            this.faixaEtaria = "Invalidado";
        }
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return preco;
	}


	//classes
	public Brinquedo() {
		
	}

	public Brinquedo(String nome) {
		this.nome = nome;
	}
	
	public Brinquedo(String nome, String faixaEtaria, float preco) {
		this.nome = nome;
		setFaixaEtaria(faixaEtaria);
		this.preco = preco;
	}

	public void mostrar() {
		System.out.println("Nome: " + nome + "\nFaixa Etaria: " + faixaEtaria + "\nPreço: " + preco + "\n");
	}
	
}
