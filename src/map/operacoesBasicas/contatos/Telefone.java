package map.operacoesBasicas.contatos;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Telefone {

	public static boolean validarTelefone(String telefone) {
		Pattern padraoTelefone = Pattern.compile("\\([0-9]{2}\\)\\s[0-9]{4,5}-[0-9]{4}");
		Matcher matcher = padraoTelefone.matcher(telefone);
		return matcher.matches();
	}

}