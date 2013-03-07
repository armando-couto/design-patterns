package padroesDeCriacao.abstractFactory;

import interfaces.Emissor;
import interfaces.Receptor;

public class MastercardComunicadorFactory implements ComunicadorFactory {

	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.MASTERCARD);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.MASTERCARD);
	}
}
