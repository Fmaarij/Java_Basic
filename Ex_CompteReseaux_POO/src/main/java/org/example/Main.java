package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /*
        Exercices sur la POO : créer la classe Personne (non, prénom,  date de naissance) et la classe Compte
        (login, mot de passe). Puis Associer une personne et son compte.
         */
        /*étape 2
         continue l’exercice de POO ci-dessus en créant la classe Adresse (nom de la rue, numéro rue, code postal,
         nom de la commune, ville, pays). Puis Associe une personne et son adresse.
         */
        //Start of creatig personne Smit
        Personne smit = new Personne();
        smit.setNom("Smit");
        smit.setPrenom("Will");
        smit.setDateDeNaissance(LocalDate.of(1979, 05, 7));
        Adresse adresse = new Adresse();
        adresse.nomDeLaRue = "Chaussée de mons";
        adresse.numeroDeLaRue = "25";
        adresse.codePostal = "1000";
        adresse.nomDeLaComune = "Bruxelles";
        adresse.ville = "Bruxelles";
        adresse.pays = "Belgique";
        //End of creatig personne Smit
        //Start of creatig personne Jhon
        Personne jhon = new Personne();
        jhon.setNom("Cina");
        jhon.setPrenom("Jhon");
        jhon.setDateDeNaissance(LocalDate.of(1981, 03, 3));
        //End of creatig personne Jhon
        System.out.println("********** Affichage de personne " + smit.prenom + " **********");
        //Affichage de smit
        System.out.println("Nom : " + smit.nom);
        System.out.println("Prénom : " + smit.prenom);
        System.out.println("Date de Naissance : " + smit.dateDeNaissance);
        System.out.println("Age : " + smit.calculeAge());
        System.out.println("Adresse Complète : " + adresse.nomDeLaRue + " " + adresse.numeroDeLaRue + "," + adresse.codePostal + " " + adresse.nomDeLaComune + ", " + adresse.ville + " " + adresse.pays);
        //End of affichage de smit
        /*
        //Affichage de Jhon
        System.out.println("********** Affichage de personne " + jhon.prenom + " **********");
        System.out.println("Nom : " + jhon.nom);
        System.out.println("Prénom : " + jhon.prenom);
        System.out.println("Date de Naissance : " + jhon.dateDeNaissance);
        System.out.println("Age : " + jhon.calculeAge());
        //End of affichage de Jhon
        */
    }
}