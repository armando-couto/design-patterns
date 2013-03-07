package padroesDeCriacao.abstractFactory;

import interfaces.Emissor;

public class EmissorMastercard implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println(" Enviando a seguinte mensagem para a Mastercard :");
		System.out.println(mensagem);
	}
}