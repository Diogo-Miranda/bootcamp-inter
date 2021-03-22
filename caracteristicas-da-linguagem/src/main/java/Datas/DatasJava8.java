package Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasJava8 {
    public static void main(String[] args) {
        // LocalDate é imutável para representar uma data
        // Seu formato padrão é yyyy-MM-dd

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);
        // 2021-03-22

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(ontem);
        // 2021-03-21

        // LocalTime é imutável que representa um padrão de
        // hora-minuto-segundo

        // Pode ser representado até nanosegundos
        // 12:22:10:123212345

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);

        // Funciona como junção de LocalTime e Local date

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);

        LocalDateTime futuro = ldt.plusHours(1).plusDays(1).plusHours(1);

        System.out.println(futuro);
    }
}
