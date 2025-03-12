/**
 * Classe représentant un produit.
 */
public class Produit {
    private String nom;
    private double prix;
    private String type; // "Alimentaire", "Electronique", "Vetement", "Livre"
    
    public Produit(String nom, double prix, String type) {
        this.nom = nom;
        this.prix = prix;
        this.type = type;
    }
    
    // Getters
    public String getNom() {
        return nom;
    }
    
    public double getPrix() {
        return prix;
    }
    
    public String getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", type='" + type + '\'' +
                '}';
    }
} 