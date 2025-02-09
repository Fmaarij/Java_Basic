import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Mettre dans une collection tous les nombres de 0 à 100, puis les afficher à l’écran
        dans l’ordre inversé de l’ajout. Puis supprimer dans votre collection le nombre 10, 50 et 80.
        Afficher à l’écran l’indice de chaque nombre supprimé.Affiche aussi à l’écran le contenu de
        votre collection sans les nombres supprimés.
         */
        List<Integer> nombresEntiers = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            nombresEntiers.add(i);
        }
        //liste inversée
        Collections.reverse(nombresEntiers);
        //Affichage de la liste inversée
        System.out.println("Affichage de la liste inversée");
        for (Integer nombresEntier : nombresEntiers) {
            System.out.print(" " + nombresEntier);
        }

        //Mettre la list en ordre
        Collections.reverse(nombresEntiers);
        //on prend les indices de 3 nombres
        Integer dix = nombresEntiers.get(10);
        Integer cinquante = nombresEntiers.get(50);
        Integer quatreVingt = nombresEntiers.get(80);
        //Suppressions des nombres souhaités
        nombresEntiers.remove(dix);
        nombresEntiers.remove(cinquante);
        nombresEntiers.remove(quatreVingt);
        System.out.println(" ");
        //Affichage de l'indice des nombres supprimés
        System.out.println(" Les indices des nombres supprimés :  " + dix + " " + cinquante + " " + quatreVingt);
        //Affichage du contenu de la collection sans les nombres supprimés.
        System.out.println("Affichage du contenu de la collection sans les nombres supprimés.");
        for (Integer nombresEntier : nombresEntiers) {
            System.out.print(" " + nombresEntier);
        }


    }
}