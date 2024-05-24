package set.operacoesBasicas.palavras;

public class ManterPalavras {

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
		conjuntoPalavras.adicionarPalavra("Maçã");
		conjuntoPalavras.adicionarPalavra("Mesa");
		conjuntoPalavras.adicionarPalavra("Garrafa");
		conjuntoPalavras.adicionarPalavra("Faculdade");
		conjuntoPalavras.adicionarPalavra("Celular");
		conjuntoPalavras.adicionarPalavra("Trabalho");
		conjuntoPalavras.adicionarPalavra("Trabalho");
		conjuntoPalavras.exibirPalavrasUnicas();
		conjuntoPalavras.verificarPalavra("Doutor");
		conjuntoPalavras.verificarPalavra("Maçã");
		conjuntoPalavras.removerPalavra("Faculdade");
		conjuntoPalavras.removerPalavra("Faculdade");
		conjuntoPalavras.exibirPalavrasUnicas();
	}

}
