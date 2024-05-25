package set.ordenacao.produtos;

public class ManterProdutos {

	public static void main(String[] args) {
		CadastroProdutos produtos = new CadastroProdutos();
		produtos.adicionarProduto(1, "Samsung Galaxy", 1899.00, 25);
		produtos.adicionarProduto(1, "Samsung Galaxy", 1899.00, 25);
		produtos.adicionarProduto(2, "Teclado", 150.00, 76);
		produtos.adicionarProduto(3, "GTX 1650", 1299.00, 15);
		produtos.adicionarProduto(4, "Mouse", 59.99, 89);
		produtos.adicionarProduto(5, "Gabinete", 145.50, 10);
		produtos.exibirProdutosPorNome();
		produtos.exibirProdutosPorPreco();
	}

}