package padroesComportamentais.state;

import interfaces.Bandeira;

public class TestaTaximetro {

	public static void main(String[] args) {
		Bandeira b1 = new Bandeira1();
		Bandeira b2 = new Bandeira2();

		Taximetro taximetro = new Taximetro(b1);

		System.out.println(" Valor da corrida em bandeira 1: " + taximetro.getBandeira().calculaValorDaCorrida(10, 20));
		taximetro.setBandeira(b2);

		System.out.println(" Valor da corrida em bandeira 2: " + taximetro.getBandeira().calculaValorDaCorrida(5, 30));
	}
}
