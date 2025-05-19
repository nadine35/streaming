// package fr.afpa;

// public class Playlist {
//     private Film[] films;
//     private int max = 10;
//     private int index; // Pour suivre combien de films ont été ajoutés à la playlist

//     // Constructeur par défaut qui initialise une playlist vide
//     public Playlist() {
//         this.films = new Film[max]; // Tableau de films avec une taille de 10
//         this.index = 0; // Aucune vidéo n'a été ajoutée au départ
//     }

//     // Méthode pour ajouter un film dans la playlist
//     public void ajouter(Film film) {
//         if (index < films.length) { // Vérifie s'il y a de la place
//             films[index] = film; // Ajoute le film à l'emplacement suivant
//             index++; // Incrémente l'index pour le prochain film
//             System.out.println("Film ajouté à la playlist : " + film.getTitre());
//         } else {
//             // Si la playlist est pleine, affiche un message d'erreur
//             System.out.println("Limite de films atteinte !"); // Si la playlist est pleine
//         }
//     }

//     // Méthode pour afficher les 5 derniers films regardés
//     public void afficherDerniersFilms() {
//         if (index == 0) { // Si aucun film n'a été regardé
//             System.out.println("Aucun film n'a été regardé.");
//         } else {
//             System.out.println("Les 5 derniers films regardés :");

//             // Limite à 5 films ou moins
//             int count = 0;
//             for (int i = index - 1; i >= 0 && count < 5; i--) {
//                 System.out.println("- " + films[i].getTitre());
//                 count++;
//             }
//         }
//     }

//     // Méthode pour vérifier si un film est dans la playlist
//     public boolean contientFilm(Film film) {
//         // Parcourt tous les films dans la playlist jusqu'à l'index actuel
//         for (int i = 0; i < index; i++) {

//             // Vérifie si le film actuel n'est pas nul et compare les titres des films
//             if (films[i] != null && films[i].getTitre() == film.getTitre()) {
//                 // Si un film avec le même titre est trouvé, retourne 'true'
//                 return true;
//             }
//         }

//         // Si aucun film n'est trouvé dans la playlist, retourne 'false'
//         return false;
//     }

//     public Playlist(Film[] films) {
//         this.films = films;
//     }

//     public Film[] getFilms() {
//         return films;
//     }

//     public void setFilms(Film[] films) {
//         this.films = films;
//     }

//     // Getter pour obtenir la limite de films
//     public int getLIMITE() {
//         return max;
//     }

//     @Override
//     public String toString() {
//         return "Playlist [films=" + films + ", LIMITE=" + max + "]";
//     }

// }
package fr.afpa;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Film> films; // Liste dynamique de films

    // Constructeur par défaut qui initialise une playlist vide
    public Playlist() {
        this.films = new ArrayList<>(); // Liste vide initialement
    }

    // Méthode pour ajouter un film dans la playlist
    public void ajouterFilmPlaylist(Film film) {
        films.add(film); // Ajoute le film à la liste
        System.out.println("Film ajouté à la playlist : " + film.getTitre());
    }

    // Méthode pour afficher les 5 derniers films regardés
    public void afficherDerniersFilms() {
        if (films.isEmpty()) { // Si la playlist est vide
            System.out.println("Aucun film n'a été regardé.");
        } else {
            System.out.println("Les 5 derniers films regardés :");

            // Limite à 5 films ou moins
            int count = 0;
            for (int i = films.size() - 1; i >= 0 && count < 5; i--) {
                System.out.println("- " + films.get(i).getTitre());
                count++;
            }
        }
    }

    // Méthode pour vérifier si un film est dans la playlist
    public boolean contientFilm(Film film) {
        // Parcourt tous les films dans la playlist
        for (Film f : films) {
            if (f.getTitre().equals(film.getTitre())) {
                return true; // Si un film avec le même titre est trouvé
            }
        }
        return false; // Aucun film trouvé
    }

    // Getter pour obtenir la liste des films
    public List<Film> getFilms() {
        return films;
    }

    // Setter pour définir la liste des films (si nécessaire)
    public void setFilms(List<Film> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Playlist [films=" + films + "]";
    }
}
