package padroesComportamentais.mediator;

public class Taxi {

	private CentralDeTaxi central;
	private int id;
	private static int contador = 0;

	public Taxi(CentralDeTaxi central) {
		this.central = central;
		this.id = Taxi.contador++;
	}

	public int getId() {
		return id;
	}

	public void atende() {
		try {
			Thread.sleep((long) (Math.random() * 3000.0));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.central.adicionaTaxiDisponivel(this);
	}
}