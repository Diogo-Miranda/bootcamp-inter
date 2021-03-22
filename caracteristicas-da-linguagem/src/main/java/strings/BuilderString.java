package strings;

public class BuilderString {
    public static void main(String[] args) {
        var nome = "Diogo";

        final var builder = new StringBuilder(nome);
        System.out.println(builder.append("Araujo"));

        final var reverse = builder.reverse();

        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);

        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(" "));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));

    }
}
