package padroesEstruturais.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Apresentacao {

	private List<Slide> slides = new ArrayList<Slide>();

	public void adicionaSlide(Slide slide) {
		slides.add(slide);
	}

	public void imprime() {
		for (Slide slide : this.slides) {
			slide.imprime();
			System.out.println();
		}
	}
}