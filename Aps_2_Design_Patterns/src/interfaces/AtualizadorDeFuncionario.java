package interfaces;

import padroesComportamentais.visitor.Gerente;
import padroesComportamentais.visitor.Telefonista;

public interface AtualizadorDeFuncionario {

	void atualiza(Gerente g);
	void atualiza(Telefonista t);
}