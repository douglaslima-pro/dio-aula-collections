package comparable_comparator;

import java.util.Comparator;

public class CompararNomeIdadeEstado implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		int nome = p1.compareTo(p2);
		int idade = Integer.compare(p1.getIdade(), p2.getIdade());
		int estado = p1.getEstado().compareTo(p2.getEstado());
		if(nome != 0) {
			return nome;
		} else if (idade != 0) {
			return idade;
		} else {
			return estado;
		}
	}

}
