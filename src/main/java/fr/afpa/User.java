package fr.afpa;

public abstract class User {

    private String nom;
    private String motDePasse;
    private Long numeroCompte;
    private Famille[] famille = new Famille[1];

    private int index = 0;
    private Playlist playlist; // L'utilisateur a une seule playlist

    // Constructeur
    public User(String nom, String motDePasse, Long numeroCompte) {
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.numeroCompte = numeroCompte;
        this.playlist = new Playlist(); // Initialisation de la playlist de l'utilisateur
    }

    // Méthode abstraite pour ajouter un film à la playlist
    public abstract boolean ajouterFilmPlaylist(Film film);

    // Méthode abstraite pour regarder un film
    public abstract boolean regarderFilm(Film film);

    // Méthode abstraite, chaque type d'utilisateur doit l'implémenter
    // public abstract void regarderFilm(Film film);

    // Accesseur à la playlist
    public Playlist getPlaylist() {
        return playlist;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Long getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Long numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public Famille[] getFamille() {
        return famille;
    }

    public void setFamille(Famille[] famille) {
        this.famille = famille;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
