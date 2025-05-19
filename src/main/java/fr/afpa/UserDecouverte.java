package fr.afpa;

import java.time.LocalDate;

public class UserDecouverte extends User {

    private LocalDate dateDernierFilmRegarde; // Date du dernier film regardé

    public UserDecouverte(String nom, String motDePasse, Long numeroCompte) {
        super(nom, motDePasse, numeroCompte);
        setPlaylist(new Playlist()); // Initialise une playlist vide
        this.dateDernierFilmRegarde = null; // Aucun film regardé au départ
    }

    // Ajoute un film à la playlist avec restriction
    @Override
    public boolean ajouterFilmPlaylist(Film film) {
        if (this.getPlaylist().getFilms().size() >= 1) {
            System.out.println("Compte Découverte : Un seul film est autorisé dans la playlist.");
            return false; // Si la playlist contient déjà un film, on empêche l'ajout
        }

        this.getPlaylist().ajouterFilmPlaylist(film); // Ajoute le film à la playlist
        return true;
    }

    // Regarde un film avec la restriction de 1 film par jour
    @Override
    public boolean regarderFilm(Film film) {
        LocalDate today = LocalDate.now();

        // Vérifie si un film a déjà été regardé aujourd'hui
        if (dateDernierFilmRegarde != null && dateDernierFilmRegarde.equals(today)) {
            System.out.println("Vous avez déjà regardé un film aujourd'hui.");
            return false; // Empêche l'utilisateur de regarder un autre film
        }

        // Met à jour la date du dernier film regardé
        dateDernierFilmRegarde = today;
        System.out.println("Film regardé : " + film.getTitre());
        return true;
    }
}
