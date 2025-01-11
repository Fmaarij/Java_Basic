import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*
        Voici un tableau de BigDecimal [-5.1, 4.7, 23, 0, 3, -3.4, 11]. Écrire un
        préprogramme qui calcule et affiche la somme, le produit de tous ces nombres
        (résultat avec 2 chiffres après la virgule). Le même programme doit aussi
         afficher le plus grand et le plus petit de tous ces nombres.
         */
        BigDecimal firstElement = new BigDecimal("1.00");
        BigDecimal lastElement = new BigDecimal("1.00");
        BigDecimal som = new BigDecimal("0");
        BigDecimal plusGrandNombre = new BigDecimal("0");
        BigDecimal plusPetitNombre = new BigDecimal("0");
        BigDecimal[] tabBigDecimal = {
                new BigDecimal("-5.1"),
                new BigDecimal("4.7"),
                new BigDecimal("23"),
                new BigDecimal("0"),
                new BigDecimal("3"),
                new BigDecimal("-3.4"),
                new BigDecimal("11")
        };
        for (int i = 0; i < tabBigDecimal.length; i++) {
            som = som.add(tabBigDecimal[i]);
            firstElement = tabBigDecimal[tabBigDecimal.length - i - 1];
            lastElement = tabBigDecimal[tabBigDecimal.length - 1];
            if (tabBigDecimal[i].compareTo(plusGrandNombre) > 0) {
                plusGrandNombre = tabBigDecimal[i];

            } else if (tabBigDecimal[i].compareTo(plusPetitNombre) < 0) {
                plusPetitNombre = tabBigDecimal[i];
            }
        }
        System.out.println("La plus grande nombre est : " + plusGrandNombre);
        System.out.println("La plus petit nombre est : " + plusPetitNombre);
        System.out.format("La somme de table est : %.2f", som);
        System.out.println("");
        System.out.println("First Element of the table : " + firstElement);
        System.out.println("Second Element of the table : " + lastElement);
    }
}