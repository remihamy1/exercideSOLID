
public class CalculateurTaxes {
    public double calculerPrixTotal(Produit produit) {
        return produit.getPrix() + produit.calculerTaxe();
    }
} 