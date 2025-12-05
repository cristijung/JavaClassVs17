package parteIII.Aula08.javaTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaTimeApiExample {
    public static void main(String[] args) {
        //data atual
        LocalDate today = LocalDate.now();
        System.out.println("Hoje: " + today);

        //tempo atual
        LocalTime now = LocalTime.now();
        System.out.println("Agora: " + now);

        //data e tempo atual
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Data e Hora: " + dateTime);

        //data e tempo com fuso horário
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data e Hora em São Paulo: " + zonedDateTime);

        //formatando
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Data e Hora formatada: " + formattedDateTime);

        //manipulação de data
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Data da próxima semana: " + nextWeek);

        //período
        Period period = Period.between(today, nextWeek);
        System.out.println("Dias entre hoje e a próxima semana: " + period.getDays());
    }
}
