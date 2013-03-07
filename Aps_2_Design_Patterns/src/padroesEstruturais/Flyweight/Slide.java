package padroesEstruturais.Flyweight;

public class Slide {

	private TemaFlyweight tema;
	private String titulo;
	private String texto;

	public Slide(TemaFlyweight tema, String titulo, String texto) {
		this.tema = tema;
		this.titulo = titulo;
		this.texto = texto;
	}

	public void imprime() {
		this.tema.imprime(titulo, texto);
	}
}