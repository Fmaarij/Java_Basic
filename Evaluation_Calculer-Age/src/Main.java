import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Écrire un programme qui demande à l’utilisateur son nom, sa date de naissance
        puis calcule son âge et lui affiche son nom suivie de son âge.
         */
        Scanner sc = new Scanner(System.in);
        //Asking user to enter thier name
        System.out.println("Veuiller enter votre nom : ");
        String name = sc.nextLine();
        LocalDate aajkaDate = LocalDate.now();
        //Asking user to enter thier date of birth
        System.out.println("Veuillez entrer votre date de naissance, ex :01/12/1980");
        //Stocking their date of birth
        String dateDeNaissance = sc.nextLine();
        //Getting day of birth
        int jourDeNaissance = Integer.parseInt(dateDeNaissance.substring(0, 2));
        //Getting month of birth
        int moisDeNaissance = Integer.parseInt(dateDeNaissance.substring(3, 5));
        //Getting year of birth
        int anneeDeNaissance = Integer.parseInt(dateDeNaissance.substring(6, dateDeNaissance.toString().length()));
        //calculating/finding the exacte year of the persone
        int anneTrouver = aajkaDate.getYear() - anneeDeNaissance;
        //calculating/finding the exacte month of the persone
        int moisTrouver = aajkaDate.getMonthValue() - moisDeNaissance;
        //calculating/finding the exacte day of the persone
        int jourTrouver = 0;
        if (jourDeNaissance > aajkaDate.getMonthValue()) {
            jourTrouver = 30 - (jourDeNaissance - aajkaDate.getDayOfMonth());
        } else {
            jourTrouver = (aajkaDate.getDayOfMonth() - jourDeNaissance);
        }

        System.out.println(name + " vous avez " + jourTrouver + " jours, " + moisTrouver + " mois et " + anneTrouver + " annees.");

    }
}