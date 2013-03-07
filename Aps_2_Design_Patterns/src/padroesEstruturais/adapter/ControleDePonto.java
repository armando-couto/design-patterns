package padroesEstruturais.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import padroesDeCriacao.objectPoolNaoGOF.Funcionario;

public class ControleDePonto {

	public void registraEntrada(Funcionario f) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"dd/MM/ yyyy H:m:s");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println(" Entrada : " + f.getNome() + " às " + format);
	}

	public void registraSaida(Funcionario f) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"dd/MM/ yyyy H:m:s");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println(" Saída : " + f.getNome() + " às " + format);
	}
}
