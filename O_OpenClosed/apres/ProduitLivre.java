/**
 * Classe représentant un produit de type livre.
 */
public class ProduitLivre extends ProduitBase {
    
    public ProduitLivre(String nom, double prix) {
        super(nom, prix, "Livre");
    }
    
    @Override
    public double calculerTaxe() {
        // Les livres ont une taxe de 5%
        return getPrix() * 0.05;
    }
} 