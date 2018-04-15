package br.pro.carlos.abstrata.objeto;

public abstract class Animal {
	
	private String especie;
	private String alimento;
	private int tamanho;
	private int peso;
	
	public abstract void fazBarulho();
	
	public Animal () {
		especie = "nenhuma";
		alimento = "indefinido";
		tamanho = 0;
		peso = 0;
	}
	
	public Animal (String e, String a, int t, int p) {
		especie = e;
		alimento = a;
		tamanho = t;
		peso = p;
	}
	
	public String getEspecie() {
		return especie;
	}

}
