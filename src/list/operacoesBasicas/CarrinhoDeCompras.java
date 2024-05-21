package list.operacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {

	private List<Item> carrinhoDeCompras;

	public CarrinhoDeCompras() {
		this.carrinhoDeCompras = new ArrayList<>();
	}

	public boolean adicionarItem(String nome, double preco, int quantidade) {
		for (Item i : this.carrinhoDeCompras) {
			if (i.getNome().compareToIgnoreCase(nome) == 0) {
				return false;
			}
		}
		return this.carrinhoDeCompras.add(new Item(nome, preco, quantidade));
	}

	public boolean removerItem(String nome) {
		for (Item i : this.carrinhoDeCompras) {
			if (i.getNome().compareToIgnoreCase(nome) == 0) {
				return this.carrinhoDeCompras.remove(i);
			}
		}
		return false;
	}

	public double calcularValorTotal() {
		double valorTotal = 0;
		for (Item i : this.carrinhoDeCompras) {
			valorTotal += i.getPreco() * i.getQuantidade();
		}
		return valorTotal;
	}

	public List<Item> obterCarrinhoDeCompras() {
		return this.carrinhoDeCompras;
	}

}
