package fr.afpa;

import java.time.LocalDate;
import java.util.List;

/**
 * Classe qui représente un film.
 */
public class Film {
    private int id;
    private String titre;
    private LocalDate dateDeSortie;
    private List<Acteur> acteurs;

    /**
     * Constructeur de film
     */
    public Film(int id, String titre, LocalDate dateDeSortie, List<Acteur> acteurs) {
        this.id = id;
        this.titre = titre;
        this.dateDeSortie = dateDeSortie;
        this.acteurs = acteurs;
    }

    /**
     * Deuxième constructeur que ne prend pas d'acteurs en paramètre.
     * Cas particulier : film d'animation sans doubleur
     */
    public Film(int id, String titre, LocalDate dateDeSortie) {
        this.id = id;
        this.titre = titre;
        this.dateDeSortie = dateDeSortie;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", dateDeSortie=" + dateDeSortie +
                ", acteurs=" + acteurs +
                '}';
    }
}