import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*
        Écrire un programme qui demande à l’utilisateur son nom,sa date de naissance puis calcule
        son âge et lui affiche son nom suivie de son âge.
         */

        /*
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        Date vandaag = new Date();
        System.out.println("Afichage de la Date et heure en totalité");
        System.out.println(vandaag);

        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.SHORT
        );
        System.out.println("Afichage de la Date et heure en Courte");
        System.out.println(shortDateFormat.format(vandaag));

        DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
                DateFormat.MEDIUM, DateFormat.MEDIUM
        );

        System.out.println("Afichage de la Date et heure en Medium");
        System.out.println(mediumDateFormat.format(vandaag));

        DateFormat longDateFormat = DateFormat.getDateTimeInstance(
                DateFormat.LONG, DateFormat.LONG
        );
        System.out.println("Affichage de la date et heure en Long");
        System.out.println(longDateFormat.format(vandaag));

        DateFormat fullDateFormat = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.FULL
        );
        System.out.println("Affichage de la date et heure en Full");
        System.out.println(fullDateFormat.format(vandaag));

         */
/*
        // DATE
       Date maintenant = new Date();
       System.out.println(maintenant);

 */
        /*
        //Calendar
        Date dateDeJour = new Date();
        Calendar calendrier = Calendar.getInstance();
        // calendrier.set(2024,Calendar.DECEMBER,20);
        // System.out.println(calendrier.getTime());
        // calendrier.add(Calendar.DAY_OF_MONTH,5);
        System.out.println("Affichage de date de jour");
        System.out.println(dateDeJour);
        System.out.println("Affichage de Calendrier");
        System.out.println(calendrier.getTime());
        //formating Date
        DateFormat dateFormter = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.SHORT
        );
        System.out.println("Affichage date formater de jour");
        System.out.println(dateFormter.format(dateDeJour));
        */

        //LocalDate
        LocalDate aajkaDate = LocalDate.now();
        System.out.println(aajkaDate);
        LocalDate dateSpecifique = LocalDate.of(2020, 1, 1);
        System.out.println(dateSpecifique);
        LocalDate tommorrow = aajkaDate.plusDays(5);
        System.out.println(tommorrow);

    }
}