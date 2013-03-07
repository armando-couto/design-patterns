package padroesComportamentais.visitor;

import interfaces.AtualizadorDeFuncionario;

public class Telefonista extends Funcionario {

	private int ramal;

	public Telefonista(String nome, double salario, int ramal) {
		super(nome, salario);
		this.ramal = ramal;
	}

	public int getRamal() {
		return ramal;
	}

	public void aceita(AtualizadorDeFuncionario atualizador) {
		atualizador.atualiza(this);
	}
}