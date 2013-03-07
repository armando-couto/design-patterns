package padroesDeCriacao.factoryMethod;

import interfaces.Emissor;

public class TestaEmissores {

	public static void main(String[] args) {
		EmissorCreator creator = new EmissorCreator();

		// SMS
		Emissor emissor1 = creator.create(EmissorCreator.SMS);
		emissor1.envia(" K19 Treinamentos ");

		// Email
		Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
		emissor2.envia(" K19 Treinamentos ");

		// JMS
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.envia(" K19 Treinamentos ");
	}
}
