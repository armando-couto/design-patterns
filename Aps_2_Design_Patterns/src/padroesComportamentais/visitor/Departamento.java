package padroesComportamentais.visitor;

import interfaces.AtualizadorDeFuncionario;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nome;
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public Departamento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void aceita(AtualizadorDeFuncionario atualizador) {
		for (Funcionario f : this.funcionarios) {
			f.aceita(atualizador);
		}
	}
}