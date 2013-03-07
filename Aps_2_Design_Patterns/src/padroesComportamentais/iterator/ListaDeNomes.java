package padroesComportamentais.iterator;

import java.util.Iterator;

public class ListaDeNomes implements Iterable<String> {

	private String[] nomes;
	private int length;

	public ListaDeNomes(String[] nomes) {
		this.nomes = nomes;
		this.length = this.nomes.length;
	}

	@Override
	public Iterator<String> iterator() {
		return this.new ListaDeNomesIterator();
	}

	private class ListaDeNomesIterator implements Iterator<String> {
		private int i = 0;

		public boolean hasNext() {
			return (this.i) < ListaDeNomes.this.length;
		}

		public String next() {
			return ListaDeNomes.this.nomes[i++];
		}

		public void remove() {
			ListaDeNomes.this.nomes[i] = null;

			for (int j = i; (j + 1) < ListaDeNomes.this.length; j++) {
				ListaDeNomes.this.nomes[j] = ListaDeNomes.this.nomes[j + 1];
			}
			ListaDeNomes.this.length--;
		}
	}
}