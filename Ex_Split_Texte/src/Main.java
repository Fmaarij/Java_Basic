public class Main {
    public static void main(String[] args) {
        String text = "les élections communales 2024 sont terminée. Nous avons votés, maintenant nous laissons la place à la mafia des coalitions";
        String[] texte = text.split(" ");
    /*
        //Méthode avec boucle for
        for (int i = 0; i < text.length(); i++) {
            System.out.println(i + " " + texte[i]);
        }
    */
        //Méthode avec boucle foreach
        for (String mots : texte) {
            System.out.println(mots);
        }
    }
}