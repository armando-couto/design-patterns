package padroesEstruturais.composite;

import interfaces.Trecho;

public class TrechoAndando implements Trecho {

	private String direcao;
	private double distancia;

	public TrechoAndando(String direcao, double distancia) {
		this.direcao = direcao;
		this.distancia = distancia;
	}

	@Override
	public void imprime() {
		System.out.println("Vá Andando : ");
		System.out.println(this.direcao);
		System.out.println("A distância percorrida será de: " + this.distancia + " metros .Ã-");
	}
}