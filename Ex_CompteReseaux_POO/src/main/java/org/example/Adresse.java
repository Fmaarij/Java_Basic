package org.example;

public class Adresse {
    /*
    nom de la rue, numéro rue, code postal,
         nom de la commune, ville, pays
     */
    String nomDeLaRue;
    String numeroDeLaRue;
    String codePostal;
    String nomDeLaComune;
    String ville;
    String pays;

    //Constructer
    public Adresse() {

    }
    //Getter & Setter

    public String getNomDeLaRue() {
        return nomDeLaRue;
    }

    public void setNomDeLaRue(String nomDeLaRue) {
        this.nomDeLaRue = nomDeLaRue;
    }

    public String getNumeroDeLaRue() {
        return numeroDeLaRue;
    }

    public void setNumeroDeLaRue(String numeroDeLaRue) {
        this.numeroDeLaRue = numeroDeLaRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getNomDeLaComune() {
        return nomDeLaComune;
    }

    public void setNomDeLaComune(String nomDeLaComune) {
        this.nomDeLaComune = nomDeLaComune;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
