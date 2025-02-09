import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        Écrire un programme qui tire au hasard des nombres entre 1 et 100 pour remplir une collection.
        Le tirage s’arrête dès qu’on a tiré un nombre dont sa partie entière est un nombre premier.
        Dans un premier temps, affiche à l’utilisateur ces nombres dans l’ordre où ils ont été tirés.
        Dans un deuxième temps, affiche à l’utilisateur ces nombres dans l’ordre trié, du plus grand
        au plus petit. Affiche aussi le plus petit et le grand de tous les nombres tirés NB : les nombres
        ne doivent pas avoir plus de 2 chiffres après la virgule.
         */

        //Création d'une list vide
        Random random = new Random();
        List<Double> nombreAuHasard = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < 100; i++) {
            double nombre = random.nextInt(100) + 1;
            nombreAuHasard.add(nombre);
            //affichage des nombres tirés
            for (double nh : nombreAuHasard) {
                System.out.println("Nombres dans l’ordre où ils ont été tirés : " + df.format(nh));
            }

            //verification si nombre est premier
            int j;
            for (j = 2; j * j <= nombre; j++) {
                if (nombre % j == 0) break;
            }
            if (j * j > nombre && nombre > 1) {
                System.out.println("Nombre premier trouvé : " + df.format(nombre));
                break;
            }

        }

        for (double nh : nombreAuHasard) {
            System.out.println("Nombres tirés : " + df.format(nh));
        }

        Collections.sort(nombreAuHasard, Collections.reverseOrder());
        System.out.println("Nombres trié de plus grand au plus petit : " + nombreAuHasard);
        Collections.sort(nombreAuHasard);
        System.out.println("Nombres trié de plus petit au plus grand : " + nombreAuHasard);
        System.out.println("***********Le plus petit et le plus grand nombres tiré sont ***********");
        double plusGrand = Collections.max(nombreAuHasard);
        System.out.println("le nombre le plus grands tiré est :" + df.format(plusGrand));
        double plusPetit = Collections.min(nombreAuHasard);
        System.out.println("le nombre le plus petit tiré est :" + df.format(plusPetit));

    }
}