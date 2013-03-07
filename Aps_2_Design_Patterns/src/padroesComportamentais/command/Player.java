package padroesComportamentais.command;

public class Player {

	public void play(String filename) throws InterruptedException {
		System.out.println(" Tocando o arquivo " + filename);
		long duracao = (long) (Math.random() * 2000);
		System.out.println(" Duração (s) :" + duracao / 1000.0);
		Thread.sleep(duracao);
		System.out.println(" Fim ");
	}

	public void increaseVolume(int levels) {
		System.out.println(" Diminuindo o volume em " + levels);
	}

	public void decreaseVolume(int levels) {
		System.out.println(" Aumentando o volume em " + levels);
	}
}