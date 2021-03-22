package Datas;

import java.time.Instant;
import java.util.Date;

public class DatasTratadasInicialmente {

    public static void main(String[] args) {
        // Cria uma data no milisegundo mais próximo
        Date novaData = new Date();
        System.out.println(novaData);

        // Exemplo construtor Date()

        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        novaData = new Date(currentTimeMillis);
        System.out.println(novaData);

        // Retorna uma bara mais formatada, melhor para trabalhar com marcações temporais
        Instant instant = novaData.toInstant();
        System.out.println(instant);
    }
}
