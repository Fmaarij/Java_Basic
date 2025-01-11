public class Main {
    public static void main(String[] args) {
        /*
        Écrire un programme qui affiche le tableau suivant dans cet ordre.
         */
        int[][] tabDimTwo = {{18, 28, 18, 28}, {45, 90, 45, 0}};
        for (int i = 0; i < tabDimTwo.length; i++) {
            System.out.println();
            for (int j = 0; j < tabDimTwo[i].length; j++) {
                System.out.print(tabDimTwo[i][j]);
                System.out.print("\t");
            }
        }
    }
}