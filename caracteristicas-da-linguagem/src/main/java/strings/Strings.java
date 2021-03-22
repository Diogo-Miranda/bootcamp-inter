package strings;

import java.util.Locale;

public class Strings {

    public static void main(String[] args) {
        var nome = "Diogo";
        var sobreNome = "Araujo";
        final var nomeCompleto = nome + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome do completo do cliente : " + nomeCompleto);
        var string = new String(" Minha String ");

        final var mensagem = String.format("O Cliente %s possui sobrenome %s", nome, sobreNome);
        System.out.println(mensagem);

        System.out.println(String.format("Numero %.2f", 1.255452));

        System.out.println("Quantidade = " + string.length());
        System.out.println("Sem Trim [" + string + "] ");
        System.out.println("Com Trim [" + string.trim() + "] "); // Retira os caracteres no começo
        System.out.println("Lower " + string.toLowerCase());
        System.out.println("Upper " + string.toUpperCase());
        System.out.println("Contém M? "+ string.contains("M"));
        System.out.println("Contém X? "+ string.contains("X"));
        System.out.println("Replace " + string.replace("n", "$"));
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" mInHa StRiNG "));
        System.out.println("Substring(1,6)= " + string.substring(1, 6));
    }
}
