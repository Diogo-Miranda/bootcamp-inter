package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExecicioData {

    public static String StringDueDate = "16/12/2023";

    public static int daysForDueDate(Calendar dueDate) {
        Calendar currentDate = Calendar.getInstance();
        dueDate.add(Calendar.DATE, 10); // Adicionar 10 dias do dia de vencimento

        int daysToDueDate = dueDate.get(Calendar.DAY_OF_YEAR) - currentDate.get(Calendar.DAY_OF_YEAR);
        int dayOfWeek = dueDate.get(Calendar.DAY_OF_WEEK);

        // Se cair na segunda
        if(dayOfWeek == 6) {
            daysToDueDate += 2;
        // Se cair no domingo
        } else if (dayOfWeek == 7) {
            daysToDueDate += 1;
        }

        return daysToDueDate;
    }

    public static void main(String[] args) {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyy");

        try {
            Date dueDate = dataFormat.parse(StringDueDate);
            Calendar calendarDueDate = Calendar.getInstance();
            calendarDueDate.setTime(dueDate);

            int daysForDueDate = daysForDueDate(calendarDueDate);

            System.out.println("Faltam "+ daysForDueDate + " dias para sua conta vencer");
        } catch (ParseException pe) {
            System.out.println("Formato de data indevido");
        }
    }

}
