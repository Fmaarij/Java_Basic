package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Personne {
    String nom;
    String prenom;
    LocalDate dateDeNaissance;

    //Constructer
    public Personne() {

    }

    //Getter && Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance + "";
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String calculeAge() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(dateDeNaissance, today);
        return period.getYears() + " An/s " + period.getMonths() + " mois et " + period.getDays() + " jours";
    }
}
