import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /*
        Faite une collection qui contient la date d’hier, aujourd’hui et demain. Affiche ces dates à l’écran.
         */
        List<LocalDate> lesDates = new ArrayList<>();
        lesDates.add(LocalDate.now());
        lesDates.add(LocalDate.now().minusDays(1));
        lesDates.add(LocalDate.now().plusDays(1));
        for (LocalDate dates : lesDates) {
            System.out.println(dates.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }

    }
}