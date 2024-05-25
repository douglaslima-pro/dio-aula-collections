package set.ordenacao.produtos;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class CadastroProdutos {

	private Set<Produto> produtos;

	public CadastroProdutos() {
		this.produtos = new HashSet<>();
	}

	public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
		System.out.println();
		Produto produto = new Produto(codigo, nome, preco, quantidade);
		if (this.produtos.add(produto)) {
			System.out.println("O produto foi adicionado!");
			System.out.println(produto);
		} else {
			System.out.println("ATT => Código " + codigo + " já está em uso!");
		}
	}

	public void exibirProdutosPorNome() {
		System.out.println();
		System.out.println("Exibindo produtos ordenados por nome...");
		System.out.println();
		Set<Produto> produtosPorNome = new TreeSet<>(this.produtos);
		if (produtosPorNome.isEmpty()) {
			System.out.println("ATT => Lista de produtos vazia!");
			return;
		}
		System.out.printf("%10s %25s %20s %15s%n", "CÓDIGO", "NOME", "PREÇO", "QUANTIDADE");
		System.out.printf("%10s %25s %20s %15s%n", "------", "----", "-----", "----------");
		for (Produto produto : produtosPorNome) {
			System.out.printf("%10d %25s %20.2f %15d%n", produto.getCodigo(), produto.getNome(), produto.getPreco(),
					produto.getQuantidade());
		}
	}

	public void exibirProdutosPorPreco() {
		System.out.println();
		System.out.println("Exibindo produtos ordenados por preço...");
		System.out.println();
		Set<Produto> produtosPorPreco = new TreeSet<>(new ProdutosPorPreco());
		produtosPorPreco.addAll(this.produtos);
		if (produtosPorPreco.isEmpty()) {
			System.out.println("ATT => Lista de produtos vazia!");
			return;
		}
		System.out.printf("%10s %25s %20s %15s%n", "CÓDIGO", "NOME", "PREÇO", "QUANTIDADE");
		System.out.printf("%10s %25s %20s %15s%n", "------", "----", "-----", "----------");
		for (Produto produto : produtosPorPreco) {
			System.out.printf("%10d %25s %20.2f %15d%n", produto.getCodigo(), produto.getNome(), produto.getPreco(),
					produto.getQuantidade());
		}
	}

}
