package padroesEstruturais.facade;

public class PedidoFacade {

	private Estoque estoque;
	private Financeiro financeiro;
	private PosVenda posVenda;

	public PedidoFacade(Estoque estoque, Financeiro financeiro,
			PosVenda posVenda) {
		this.estoque = estoque;
		this.financeiro = financeiro;
		this.posVenda = posVenda;
	}

	public void registraPedido(Pedido p) {
		this.estoque.enviaProduto(p.getProduto(), p.getEnderecoDeEntrega());
		this.financeiro.fatura(p.getCliente(), p.getProduto());
		this.posVenda.agendaContato(p.getCliente(), p.getProduto());
	}
}
