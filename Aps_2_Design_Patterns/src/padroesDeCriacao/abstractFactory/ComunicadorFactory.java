package padroesDeCriacao.abstractFactory;

import interfaces.Emissor;
import interfaces.Receptor;

public interface ComunicadorFactory {

	Emissor createEmissor();
	Receptor createReceptor();
}
