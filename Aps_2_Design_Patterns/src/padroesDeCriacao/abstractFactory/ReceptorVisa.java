package padroesDeCriacao.abstractFactory;

import interfaces.Receptor;

public class ReceptorVisa implements Receptor {

	@Override
	public String receber() {
		System.out.println(" Recebendo mensagem da Visa .");
		String mensagem = " Mensagem da Visa ";
		return mensagem;
	}
}
