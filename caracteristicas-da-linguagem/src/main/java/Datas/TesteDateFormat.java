package Datas;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.util.Date;

public class TesteDateFormat {
    public static void main(String[] args) {
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);

        System.out.println(dateToStr);
        // 22/03/2021 16:15

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);

        System.out.println(dateToStr);
        // 22 de março de 2021 16:18
    }
}
