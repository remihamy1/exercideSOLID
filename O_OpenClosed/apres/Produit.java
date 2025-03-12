/**
 * Interface pour les produits qui définit la méthode pour calculer la taxe.
 * Cette approche respecte le principe Ouvert/Fermé car on peut ajouter de nouveaux
 * types de produits sans modifier le calculateur de taxes.
 */
public interface Produit {
    /**
     * Retourne le nom du produit.
     * 
     * @return Le nom du produit
     */
    String getNom();
    
    /**
     * Retourne le prix du produit.
     * 
     * @return Le prix du produit
     */
    double getPrix();
    
    /**
     * Retourne le type du produit.
     * 
     * @return Le type du produit
     */
    String getType();
    
    /**
     * Calcule la taxe pour ce produit.
     * 
     * @return Le montant de la taxe
     */
    double calculerTaxe();
} 