package fr.afpa;

import java.time.LocalDate;
import java.util.List;

public class Film {
    private int id;
    private String titre;
    private LocalDate dateDeSortie;
    private List<Acteur> acteurs;

    public Film(int id, String titre, LocalDate dateDeSortie, List<Acteur> acteurs) {
        this.id = id;
        this.titre = titre;
        this.dateDeSortie = dateDeSortie;
        this.acteurs = acteurs;
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