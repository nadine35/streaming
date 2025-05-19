package fr.afpa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Création de quelques films
        Film et = new Film(1, "E.T.", LocalDate.of(1982, 6, 11));
        Film ipMan = new Film(2, "Ip Man", LocalDate.of(2008, 12, 12));
        Film rrr = new Film(3, "RRR", LocalDate.of(2022, 3, 25));
        Film mulholland = new Film(4, "Mulholland Drive", LocalDate.of(2001, 5, 16));

        // Utilisateur Découverte (limité à 1 film dans sa playlist, 1 film par jour)
        User user1 = new UserDecouverte("Anne", "hello", 1001L);
        User user3 = new UserDecouverte("Julien", "motdepasse3", 1003L);

        // essayer d'ajouter après la limite de 5.
        // Utilisateur Premium (pas de limite)
        User user2 = new UserPremium("Henri", "tambougins", 1002L);
        User user4 = new UserPremium("Olivier", "allo1", 1004L);
        User user5 = new UserPremium("Lucie", "boude", 1005L);
        User user6 = new UserPremium("Claudie", "sofifi", 1006L); // Ce sera un membre supplémentaire que vous allez

        // === Ajout à la playlist de l'utilisateur Découverte ===
        System.out.println("\n--- Ajout des films à la playlist de Anne (Découverte) ---");
        user1.ajouterFilmPlaylist(mulholland); // Devrait fonctionner
        user1.ajouterFilmPlaylist(ipMan); // Devrait être bloqué
        user1.ajouterFilmPlaylist(rrr); // Devrait être bloqué
        user1.ajouterFilmPlaylist(et); // Devrait être bloqué

        // 1er visionnage : doit fonctionner
        boolean vu1 = user1.regarderFilm(et); // → OK
        System.out.println("Résultat 1 : " + vu1);

        // 2e visionnage le même jour : doit être refusé
        boolean vu2 = user1.regarderFilm(ipMan); // → REFUSÉ
        System.out.println("Résultat 2 : " + vu2);

        // === Ajout à la playlist de l'utilisateur Premium ===
        System.out.println("\n--- Ajout des films à la playlist de Henri (Premium) ---");
        user2.ajouterFilmPlaylist(et);
        user2.ajouterFilmPlaylist(ipMan);
        user2.ajouterFilmPlaylist(rrr);
        user2.ajouterFilmPlaylist(mulholland);

        // Création d'une famille
        Famille famille = new Famille(1L, "La Famille Dupont");

        // Ajout de membres dans la famille
        famille.ajouterMembre(user1);
        famille.ajouterMembre(user2);
        famille.ajouterMembre(user3);
        famille.ajouterMembre(user4);
        famille.ajouterMembre(user5);
        famille.ajouterMembre(user6);

        // === Playlist actuelle ===
        System.out.println("\n--- Playlist de Anne (Découverte) ---");
        user1.getPlaylist().afficherDerniersFilms();

        System.out.println("\n--- Playlist de Henri (Premium) ---");
        user2.getPlaylist().afficherDerniersFilms();

        // TODO attention, ne passera jamais, tester avec un compte Premium
        // Affichage du numéro de compte pour l'utilisateur Premium
        if (user1 instanceof UserPremium) {
            ((UserPremium) user2).afficherNumeroCompte();
        }

        List<Acteur> acteurs = new ArrayList<>();
        acteurs.add(new Acteur("Brad Pitt"));
        acteurs.add(new Acteur("Angelina Jolie"));

        Film film = new Film(1, "Mr. & Mrs. Smith", LocalDate.of(2005, 6, 10), acteurs);

        System.out.println("Film : " + film.getTitre());
        for (Acteur a : acteurs) {
            System.out.println("Acteur : " + a.getNomComplet());
        }
    }

}
