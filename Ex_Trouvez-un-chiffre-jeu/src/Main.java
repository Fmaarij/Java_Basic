import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Exercise
        Écrire un programme qui demande à votre voisin de gauche un nombre entre 0 et 10.
        Puis demande à votre voisin de droite de deviner ce nombre. S’il trouve tu affiches
        « trouvé », s’il se trompe tu lui donnes une indication "plus" ou "moins" pour l'orienter
        vers la bonne réponse. S’il rate 3 fois tu lui affiches la bonne réponse
         */

        String LeftNeighbor = "Voisingauche";
        String RightNeighbor = "Voisindroite";
        int InsertedNumber = 0;
        int GuessedNumber = 0;
        int count = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println(LeftNeighbor + " please Entre un number between 0 and 10:");
        //Conditions to know if the user inserted a number between 0 and 10
        if (scan.hasNextInt()) {
            InsertedNumber = scan.nextInt();
            if (InsertedNumber >= 0 && InsertedNumber <= 10) {
                System.out.println(RightNeighbor + " Can you guess the number entered by " + LeftNeighbor + "?");
                GuessedNumber = scan.nextInt();
                //While loop is used to know if the user inserted the right number and to give the user 3 try
                while (GuessedNumber != InsertedNumber && count != 3) {
                    if (InsertedNumber >= 0 && InsertedNumber <= 5) {
                        if (GuessedNumber >= 5 && GuessedNumber <= 10) {
                            System.out.println(GuessedNumber + " Wrong guessed! the number is between 0 and 5");
                            //System.out.println(GuessedNumber + " Guessednumber");
                        } else if (GuessedNumber >= 0 && GuessedNumber <= 5) {
                            System.out.println(GuessedNumber + " Wrong guessed! But nice try, the number is between 0 and 5");
                        }

                    } else if (InsertedNumber >= 5 && InsertedNumber <= 10) {
                        if (GuessedNumber >= 0 && GuessedNumber <= 5) {
                            System.out.println(GuessedNumber + " Wrong guessed! the number is between 5 and 10");
                        } else if (GuessedNumber >= 5 && GuessedNumber <= 10) {
                            System.out.println(GuessedNumber + " Wrong guessed! But nice try, the number is between 5 and 10");

                        }
                    }
                    GuessedNumber = scan.nextInt();
                    count++;
                }
                if (GuessedNumber != InsertedNumber) {
                    System.out.println(GuessedNumber + ": Wrong guessed!");
                    System.out.println("The right number is : " + InsertedNumber);
                } else {
                    System.out.println("Weldone,you got it, the right number is : " + GuessedNumber);
                }

                // System.out.println(GuessedNumber);
            } else if (InsertedNumber >= 10) {
                System.out.println("Sorry you entered a number which is not between 0 and 10, please restart the game");
            }
        } else {
            System.out.println("Sorry you did not enter a number, please restart the game");
        }
        //End of conditions to know if the user inserted a number between 0 and 10

    }
}