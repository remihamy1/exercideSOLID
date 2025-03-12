/**
 * Interface pour les produits qui définit la méthode pour calculer la taxe.
 * Cette approche respecte le principe Ouvert/Fermé car on peut ajouter de nouveaux
 * types de produits sans modifier le calculateur de taxes.
 */
public interface Produit {
    String getNom();
    double getPrix();
    String getType();
    double calculerTaxe();
}