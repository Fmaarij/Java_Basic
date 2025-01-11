public class Main {
    public static void main(String[] args) {
        //Tableau avec des chiffres
        double tab[] = {7.23, 12, 20.19, 4.2, 1.55, 7};
        // Initialisation des variables pour la somme et le multiplication
        double sum = 0;
        double multi = 1;
        // Boucle for pour calculer la somme et le Multiplication
       /* for (int i = 0; i < tab.length; i++) {
            sum = tab[i] + sum;
            multi = tab[i] * multi;
        }*/
        // Boucle foreach pour calculer la somme et le Multiplication
        for (double numbers : tab) {
            sum += numbers;
            multi *= numbers;
        }
        //Affichge des résultats
        System.out.println("****************Addition****************");
        System.out.println(sum);
        System.out.println("****************Multiplication****************");
        System.out.println(multi);
    }
}