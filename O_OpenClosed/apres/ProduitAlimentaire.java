/**
 * Classe représentant un produit alimentaire.
 */
public class ProduitAlimentaire extends ProduitBase {
    
    public ProduitAlimentaire(String nom, double prix) {
        super(nom, prix, "Alimentaire");
    }
    
    @Override
    public double calculerTaxe() {
        // Les produits alimentaires ont une taxe de 5.5%
        return getPrix() * 0.055;
    }
} 