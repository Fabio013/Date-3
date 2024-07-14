import java.time.*;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int anno = data.getYear();
        int mese = data.getMonthValue();
        int giornoMese = data.getDayOfMonth();
        DayOfWeek giornoSettimana = data.getDayOfWeek();
        System.out.println("Anno: " + anno + "\nMese: " + mese + "\nGiorno: " + giornoMese + "\nGiorno della settimana: " + giornoSettimana);

        // Ho poi sperimentato un po' con alcuni dei metodi delle date
        int annoInt = data.getYear();
        // alternativa
        Year annoInt2 = Year.of(data.getYear());

        String meseStringa = String.valueOf(data.getMonth());
        // alternativa
        int meseInt = data.getMonthValue();
        // alternativa2
        Month meseStringa2 = Month.of(data.getMonthValue());

        int giornoInt = data.getDayOfMonth();
        // alternativa che fornisce mese e giorno
        MonthDay giornoInt2 = MonthDay.from(data);


        DayOfWeek giornoSettimanaDoW = data.getDayOfWeek();
        // alternativa
        String giornoSettimanaString = String.valueOf(data.getDayOfWeek());


        System.out.println("\nData prova alternative: ");
        System.out.println(annoInt2 + " " + meseStringa2 + " " + giornoInt + " " + giornoSettimanaString);



    }
}