/**
 * Classe représentant un produit électronique.
 */
public class ProduitElectronique extends ProduitBase {
    
    public ProduitElectronique(String nom, double prix) {
        super(nom, prix, "Electronique");
    }
    
    @Override
    public double calculerTaxe() {
        // Les produits électroniques ont une taxe de 20%
        return getPrix() * 0.2;
    }
} 