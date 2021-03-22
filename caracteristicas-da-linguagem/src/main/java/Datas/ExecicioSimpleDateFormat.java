package Datas;

import java.text.SimpleDateFormat;
import java.util.Date;

// Imprimir no formato DD/MM/YYYY HH:MM:SS:MMM
public class ExecicioSimpleDateFormat {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");

        Date agora = new Date();
        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
