package padroesDeCriacao.factoryMethod;

import interfaces.Emissor;

public class EmissorJMS implements Emissor {
	public void envia(String mensagem) {
		System.out.println(" Enviando por JMS a mensagem : ");
		System.out.println(mensagem);
	}
}
