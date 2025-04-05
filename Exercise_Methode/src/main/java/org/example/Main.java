package org.example;

public class Main {
 /*   Reprend l’exercice sur le calcul du chiffre d’affaire et du bénéfice de Fotso Victor
                (25/09/2024). Calculer son chiffre d’affaire et son bénéfice. Si le chiffre d’affaire est
        supérieur à zéro, afficher « bon travail » sinon, afficher « mauvais travail ». Si le
        bénéfice est supérieur à 10 mille fcfa, afficher « très bon résultat », s’il est entre 10
        mille et zéro afficher « résultat insuffisant », si ce bénéfice est inférieur à zéro
        afficher « très mauvais résultat ».
        NB : Utilise des fonctions et/ou des procédures*/

        /*Avant d'être milliardaires, monsieur FOTSO Victor vendait de la cola dans
        les années 1940. Une cola coûtait 10 francs CFA et en une journée il vendait
        en moyenne 1000 cola. Le prix d'achat d'un sac de cola d'une capacité de 500
        cola était de 200 francs CFA. Le prix de transport par jour d'un sac de cola était
        de 25 francs CFA. Sa dépense en nutrition par jour était de 50 francs
        CFA. L'emballage lui coûtait 10 francs CFA par jour. Monsieur FOTSO te
        contacte pour que tu l'aide à calculer son chiffre d'affaires et son bénéfice
        moyen annuel, puis écrire un programme informatique pour rendre tout cela
        automatique.
*/

    //debut de la procédure calcule Chiffres d'affaire Annuel
    public static double calculerLeChifreDeAffaireAnnuel(double prixCola1Jour, double prixCola, int jourAnnee) {
        double chifreDeAffaireParAn = prixCola1Jour * prixCola * jourAnnee;
        return chifreDeAffaireParAn;
    }
    //fin de la procédure calcule Chiffres d'affaire Annuel

    //debut de la procédure calcule depense Annuel
    public static double calculeDepenseAnnuel(double Psac1000, double PtranspSac2day, double Nutr1day, double Embal1day, int JourAnnee) {
        double calculeDepenseYear = ((Psac1000 + PtranspSac2day + Nutr1day + Embal1day) * JourAnnee);
        return calculeDepenseYear;
    }
    //fin de la procédure calcule depense Annuel

    //debut de la procédure calcule benefice Annuel
    public static double calculeBeneficeAnnuel(double ca, double dn) {
        double beneficeAnnuel = ca - dn;
        return beneficeAnnuel;
    }
    //fin de la procédure calcule beneifce Annuel


    public static void main(String[] args) {
        //Debut de l'appel à la function calculerLeChifreDeAffaireAnnuel
        double chiifredeA = calculerLeChifreDeAffaireAnnuel(1000, 10, 364);
        System.out.println("Chiffre d'affaires = " + chiifredeA);
        //Fin de l'appel à la function calculerLeChifreDeAffaireAnnuel

        //Debut de l'appel à la function calculerLeChifreDeAffaireAnnuel
        double depenseAnnuel = calculeDepenseAnnuel(400, 50, 50, 10, 365);
        System.out.println("Depense Annuel = " + depenseAnnuel);
        //Fin de l'appel à la function calculerLeChifreDeAffaireAnnuel

        //Debut de l'appel à la funtion calculerLeChifreDeAffaireAnnuel
        double benefice = calculeBeneficeAnnuel(chiifredeA, depenseAnnuel);
        System.out.println("Benifice annuel = " + benefice);
        //Fin de l'appel à la funtion calculerLeChifreDeAffaireAnnuel
    }
}