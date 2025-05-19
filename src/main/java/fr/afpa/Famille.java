package fr.afpa;

import java.util.Arrays;

public class Famille {
    private Long id;
    private String nom;
    private User[] users = new User[5];



    // Méthode pour calculer une remise (exemple : 10% par défaut)
    public double calcRemise() {
        return 0.10; // 10% de remise par défaut
    }

     // Méthode pour ajouter un membre à la famille
    public boolean ajouterMembre(User user) {
        // Cherche la première place vide dans le tableau
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                System.out.println(user.getNom() + " a été ajouté à la famille.");
                return true;  // L'utilisateur a été ajouté
            }
        }
        System.out.println("La famille ne peut pas avoir plus de 5 membres.");
        return false;  // La famille est pleine
    }

    public Long getId() {
        return id;

    }

    @Override
    public String toString() {
        return "Famille [id=" + id + ", nom=" + nom + ", users=" + Arrays.toString(users) + "]";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Famille(Long id, String nom, User[] users) {
        this.id = id;
        this.nom = nom;
        this.users = users;
    }

}
