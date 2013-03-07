package padroesDeCriacao.abstractFactory;

import interfaces.Receptor;

public class ReceptorMastercard implements Receptor {

	@Override
	public String receber() {
		System.out.println(" Recebendo mensagem da Mastercard .");
		String mensagem = " Mensagem da Mastercard ";
		return mensagem;
	}
}
