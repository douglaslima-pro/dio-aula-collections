package map.pesquisa.produtos;

import java.util.Locale;

public class ManterProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		EstoqueProdutos produtos = new EstoqueProdutos();
		produtos.exibirProdutos();
		produtos.adicionarProduto(1, "Samsung Galaxy S23 5G 256GB", 2_999.00, 30);
		produtos.adicionarProduto(2, "RTX 4090", 12_099.00, 10);
		produtos.adicionarProduto(4, "Mesa gamer", 399.00, 59);
		produtos.adicionarProduto(5, "Adaptador HDMI", 39.99, 150);
		produtos.adicionarProduto(5, "Adaptador HDMI", 39.99, 150);
		produtos.exibirProdutos();
		produtos.obterProdutoMaisCaro();
		produtos.obterProdutoMaisBarato();
		produtos.calcularValorTotalEstoque();
	}

}
