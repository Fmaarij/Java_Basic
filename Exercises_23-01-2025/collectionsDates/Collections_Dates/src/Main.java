import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Écrire un programme qui tire au hasard 50 dates différentes, entre le premier jour de l’année
        en cours et le dernier jour de la même année, puis classe ces dates dans l’ordre croissant.
        On affichera à l’utilisateur les dates dans l’ordre où elles ont été tirées et dans l’ordre trié.
        Affiche aussi la date la plus ancienne et celle la plus récente. NB : les dates doivent être
        sous le format année-mois-jour.
         */
        //L'année Actuel
        int currentYear = LocalDate.now().getYear();
        //Premiere jour de l'année
        LocalDate premierJour = LocalDate.of(currentYear, 1, 1);
        //Dernière jour de l'année
        LocalDate dernierJour = LocalDate.of(currentYear, 12, 31);
        Random rand = new Random();
        Set<LocalDate> dates = new HashSet<>();
        while (dates.size() < 50) {
            int randomDay = rand.nextInt(dernierJour.getDayOfYear()) + 1;
            dates.add(premierJour.plusDays(randomDay - 1));
        }

        //affichage du dates dans l’ordre où elles ont été tirées
        System.out.println("*****affichage du dates dans l’ordre où elles ont été tirées*****");
        System.out.println(dates);

        System.out.println("*****affichage du dates dans l’ordre trié*****");
        List<LocalDate> datesList = new ArrayList<>(dates);
        System.out.println(datesList);
        Collections.sort(datesList);
        System.out.println("*****50 dates aléatoires de l'année " + currentYear + " :*****");
        for (LocalDate date : datesList) {
            System.out.println(date);
        }
        //Affichage de la date la plus ancienne et la plus récente
        System.out.println("*****Affichage de la date la plus ancienne et la plus récente*****");
        System.out.println("Date de la plus ancienne : " + datesList.get(0));
        System.out.println("Date de la plus récente :  " + datesList.get(datesList.size() - 1));
    }
}