package fr.afpa;

public abstract class User {

    private String nom;
    private String motDePasse;
    private Long numeroCompte;

    /*
     * "User" et en association avec la "Famille"
     * La multiplicité (aussi appellée "cardinalité") du côté de "Famille" est 0..1
     * 
     * Si l'utilisateur n'a pas de "Famille" alors l'attribut "famille" sera à "null"
     * dans le cas contraire il y aura une référence vers "Famille"
     */
    private Famille famille = null;

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

    public Famille getFamille() {
        return famille;
    }

    /**
     * Setter sur l'attribut "Famille" qui sera obligatoirement à appeler pour associer l'utilisateur à une famille
     * --> pas de constructeur qui prend en paramètre une famille
     */
    public void setFamille(Famille famille) {
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
