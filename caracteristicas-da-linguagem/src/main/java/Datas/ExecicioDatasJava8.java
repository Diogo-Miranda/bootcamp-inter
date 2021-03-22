package Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Adicione 4 anos, 6 meses e 13 horas ao
// momento 15/05/2010 10:00:00
public class ExecicioDatasJava8 {
    public static void main(String[] args) {
        String momento = "15/05/2010 10:00:00";

        LocalDateTime ldtMomento = LocalDateTime.of(2000, 05, 15, 10, 0, 0);
        ldtMomento = ldtMomento.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(ldtMomento);

    }
}
