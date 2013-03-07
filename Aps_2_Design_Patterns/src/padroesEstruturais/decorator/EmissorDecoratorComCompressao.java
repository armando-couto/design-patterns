package padroesEstruturais.decorator;

import interfaces.Emissor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCompressao extends EmissorDecorator {

	public EmissorDecoratorComCompressao(Emissor emissor) {
		super(emissor);
	}

	@Override
	public void envia(String mensagem) {
		System.out.println(" Enviando mensagem comprimida : ");
		String mensagemComprimida;
		try {
			mensagemComprimida = comprime(mensagem);
		} catch (IOException e) {
			mensagemComprimida = mensagem;
		}
		this.getEmissor().envia(mensagemComprimida);
	}

	private String comprime(String mensagem) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
		dout.write(mensagem.getBytes());
		dout.close();
		return new String(out.toByteArray());
	}
}
