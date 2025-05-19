package fr.afpa;

public class UserPremium extends User {

    // Constructeur pour initialiser un utilisateur Premium
    public UserPremium(String nom, String motDePasse, Long numeroCompte) {
        super(nom, motDePasse, numeroCompte); // Appel du constructeur parent
    }


    // Implémentation de l'ajout de film à la playlist sans limite pour les
    // utilisateurs Premium
    @Override
    public boolean ajouterFilmPlaylist(Film film) {
        getPlaylist().ajouterFilmPlaylist(film); // Ajoute directement le film à la playlist
        System.out.println("Film ajouté à la playlist : " + film.getTitre());
        return true;
    }


    // Méthode pour afficher le numéro de compte de l'utilisateur premium
    public void afficherNumeroCompte() {
        System.out.println("Numéro de compte de l'utilisateur Premium : " + getNumeroCompte());
    }
    

    // Implémentation pour regarder un film sans restriction
    @Override
    public boolean regarderFilm(Film film) {
        // Pas de restriction pour les utilisateurs Premium
        System.out.println("Film regardé : " + film.getTitre());
        return true;
    }
}
