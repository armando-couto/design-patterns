package padroesEstruturais.adapter;

import padroesDeCriacao.objectPoolNaoGOF.Funcionario;

public class TesteControleDePonto {

	public static void main(String[] args) throws InterruptedException {

		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario(" Marcelo Martins ");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registraSaida(funcionario);
	}
}
