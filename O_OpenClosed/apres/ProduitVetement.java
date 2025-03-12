/**
 * Classe représentant un produit de type vêtement.
 */
public class ProduitVetement extends ProduitBase {
    
    public ProduitVetement(String nom, double prix) {
        super(nom, prix, "Vetement");
    }
    
    @Override
    public double calculerTaxe() {
        // Les vêtements ont une taxe de 10%
        return getPrix() * 0.1;
    }
} 