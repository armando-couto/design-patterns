package interfaces;

import padroesComportamentais.observer.Acao;

public interface AcaoObserver {

	void notificaAlteracao ( Acao acao );
}