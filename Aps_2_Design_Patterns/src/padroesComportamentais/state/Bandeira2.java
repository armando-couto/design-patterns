package padroesComportamentais.state;

import interfaces.Bandeira;

public class Bandeira2 implements Bandeira {

	@Override
	public double calculaValorDaCorrida(double tempo, double distancia) {
		return 10.0 + tempo * 3.0 + distancia * 4.0;
	}
}