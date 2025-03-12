/**
 * Classe qui calcule les taxes pour différents types de produits.
 * Cette classe respecte le principe Ouvert/Fermé car elle n'a pas besoin d'être modifiée
 * lorsqu'un nouveau type de produit est ajouté.
 */
public class CalculateurTaxes {
    
    /**
     * Calcule le prix total (prix + taxe) pour un produit.
     * 
     * @param produit Le produit pour lequel calculer le prix total
     * @return Le prix total
     */
    public double calculerPrixTotal(Produit produit) {
        return produit.getPrix() + produit.calculerTaxe();
    }
} 