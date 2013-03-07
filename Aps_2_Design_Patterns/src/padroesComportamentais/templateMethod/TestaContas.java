package padroesComportamentais.templateMethod;

public class TestaContas {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();

		contaCorrente.deposita(100);
		contaCorrente.saca(10);

		contaPoupanca.deposita(100);
		contaPoupanca.saca(10);

		System.out.println(" Saldo da Conta Corrente : "
				+ contaCorrente.getSaldo());
		System.out.println(" Saldo da Conta Poupança : "
				+ contaPoupanca.getSaldo());
	}
}