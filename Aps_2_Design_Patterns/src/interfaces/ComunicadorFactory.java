package interfaces;

public interface ComunicadorFactory {

	Emissor createEmissor();
	Receptor createReceptor();
}
