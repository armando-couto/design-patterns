package padroesEstruturais.Flyweight;

public class TestaTemas {

	public static void main(String[] args) {
		Apresentacao a = new Apresentacao();
		
		a.adicionaSlide(new Slide(TemaFlyweightFactory
				.getTema(TemaFlyweightFactory.K19),
				" K11 - Orientação a Objetos em Java ",
				" Com este curso você vai obter uma base \n"
						+ " sólida de conhecimentos de Java \n"
						+ "e de Orientação a Objetos ."));
		
		a.adicionaSlide(new Slide(TemaFlyweightFactory
				.getTema(TemaFlyweightFactory.ASTERISCO),
				" K12 - Desenvolvimento Web com JSF2 e JPA2 ",
				" Depois deste curso , você estará apto a\n"
						+ " desenvolver aplicações Web com \n"
						+ "os padrões da plataforma Java ."));
		
		a.adicionaSlide(new Slide(TemaFlyweightFactory
				.getTema(TemaFlyweightFactory.HIFEN),
				" K21 - Persistência com JPA2 e Hibernate ",
				" Neste curso de Java Avançado , abordamos de\n"
						+ " maneira profunda os recursos de persistência \n"
						+ "do JPA2 e do Hibernate ."));

		a.imprime();
	}
}
