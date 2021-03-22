package Datas;

import java.util.Calendar;

public class TesteCalendar {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println(agora.getTime());

        // 15 dias atrás
        agora.add(Calendar.DATE, -15);
        System.out.println(agora.getTime());

        // + 4 meses
        agora.add(Calendar.MONTH, 4);
        System.out.println(agora.getTime());

        // + 2 anos
        agora.add(Calendar.YEAR, 2);
        System.out.println(agora.getTime());

        System.out.printf("%tc\n", agora);
        // sex jul 07 15:04:21 BRT 2023

        System.out.printf("%tF\n", agora);
        // 2023-07-07

        System.out.printf("%tD\n", agora);
        // 07/07/23

        System.out.printf("%tr\n", agora);
        // 03:04:21 PM

        System.out.printf("%tT\n", agora);
        // 15:04:21
    }
}
