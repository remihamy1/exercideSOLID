public abstract class ProduitBase implements Produit {
    private String nom;
    private double prix;
    private String type;
    
    public ProduitBase(String nom, double prix, String type) {
        this.nom = nom;
        this.prix = prix;
        this.type = type;
    }
    
    @Override
    public String getNom() {
        return nom;
    }
    
    @Override
    public double getPrix() {
        return prix;
    }
    
    @Override
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