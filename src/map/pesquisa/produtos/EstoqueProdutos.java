package map.pesquisa.produtos;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {

	private Map<Integer, Produto> produtos;

	public EstoqueProdutos() {
		this.produtos = new HashMap<>();
	}

	public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
		System.out.println();
		if (!this.produtos.containsKey(codigo)) {
			Produto produto = new Produto(codigo, nome, preco, quantidade);
			this.produtos.put(codigo, produto);
			System.out.println("O produto foi adicionado ao estoque!");
			System.out.println(produto);
		} else {
			System.out.println("ATT => Código " + codigo + " já está em uso!");
		}
	}

	public void exibirProdutos() {
		System.out.println();
		if (!this.produtos.isEmpty()) {
			System.out.println(this.produtos);
		} else {
			System.out.println("ATT => Estoque de produtos vazio!");
		}
	}

	public void calcularValorTotalEstoque() {
		System.out.println();
		if (!this.produtos.isEmpty()) {
			double valorTotal = 0;
			for (Produto produto : this.produtos.values()) {
				valorTotal += produto.getQuantidade() * produto.getPreco();
			}
			System.out.printf("Valor total do estoque: R$ %.2f", valorTotal);
		} else {
			System.out.println("ATT => Estoque de produtos vazio!");
		}
	}

	public void obterProdutoMaisCaro() {
		System.out.println();
		if (!this.produtos.isEmpty()) {
			double valor = 0.00;
			Produto produtoMaisCaro = null;
			for (Produto produto : this.produtos.values()) {
				if (produto.getPreco() >= valor) {
					valor = produto.getPreco();
					produtoMaisCaro = produto;
				}
			}
			System.out.println("Produto MAIS CARO do estoque:");
			System.out.println(produtoMaisCaro);
		} else {
			System.out.println("ATT => Estoque de produtos vazio!");
		}
	}

	public void obterProdutoMaisBarato() {
		System.out.println();
		if (!this.produtos.isEmpty()) {
			double valor = Double.MAX_VALUE;
			Produto produtoMaisBarato = null;
			for (Produto produto : this.produtos.values()) {
				if (produto.getPreco() <= valor) {
					valor = produto.getPreco();
					produtoMaisBarato = produto;
				}
			}
			System.out.println("Produto MAIS BARATO do estoque:");
			System.out.println(produtoMaisBarato);
		} else {
			System.out.println("ATT => Estoque de produtos vazio!");
		}
	}

}
