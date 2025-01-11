import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Exercise
        Voici un tableau de nombres [7.23, 12, 20.19, 4.2, 1.55, 7]. Affiche à l’écran la
        somme, la multiplication de tous ces nombre, la division du dernier par le
        premier. Il faut afficher les résultats avec un chiffre après la virgule ;
        */
        double[] tableau = {7, 12, 20.19, 4.2, 1.55, 21};
        double som = 0;
        double multi = 1;
        double div = 0;
        //First element of the table
        double firstIndex = tableau[0];
        //Last element of the table
        double lastIndex = tableau[tableau.length - 1];
        //Foreach loop
        for (double ContenuDeTab : tableau) {
            som = som + ContenuDeTab;
            multi = multi * ContenuDeTab;
        }
        //Display results
        System.out.println("***Addition***");
        System.out.format("%.1f", som);
        System.out.println("");
        System.out.println("***Multiplication***");
        System.out.format("%.1f", multi);
        System.out.println("");
        System.out.println("***Division***");
        div = lastIndex / firstIndex;
        System.out.format("%.1f", div);
    }
}