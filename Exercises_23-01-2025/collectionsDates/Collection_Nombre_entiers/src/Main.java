import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Mettre dans une collection tous les nombres entiers de 0 à 100,
        puis les afficher à l’écran dans l’ordre inversé de l’ajout.
         */

        //création de la list
        List<Integer> nombreEntiers = new ArrayList<>();
        //boucle pour chercher des nombres entiers de 0 à 100
        for (int i = 0; i <= 100; i++) {
            nombreEntiers.add(i);//on ajoute de nombres
        }
        //on inverse la liste
        Collections.reverse(nombreEntiers);

        //boucle foreach pour affichage de la contenue de la list
        for (Integer num : nombreEntiers) {
            System.out.println(num);
        }

    }
}