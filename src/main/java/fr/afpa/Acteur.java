package fr.afpa;

import java.util.ArrayList;
import java.util.List;

// Classe qui représente un acteur
public class Acteur {

    private String nomComplet;
 //   private String prenom;
    private List<Film> films;// Liste des films auxquels l'acteur a participé relation avec acteurs many to
                             // many
    // donc liste d'acteurs dans Film

    public Acteur(String nomComplet) {

        this.nomComplet = nomComplet;
        
        this.films = new ArrayList<>();

    }

    public Acteur(List<Film> films) {
        this.films = films;
    }

     public String getNomComplet() {
        return nomComplet;
    }

    // public String getPrenom() {
    //     return prenom;
    // }

    // public void setPrenom(String prenom) {
    //     this.prenom = prenom;
    // }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return nomComplet; // Affiche directement le nom complet
    }

}
