package padroesComportamentais.templateMethod;

public class ContaCorrente extends Conta {

	@Override
	public double calculaTaxa() {
		return 3;
	}
}