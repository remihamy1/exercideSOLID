/**
 * Classe principale qui démontre l'utilisation du calculateur de taxes.
 */
public class Main {
    public static void main(String[] args) {
        // Création de produits de différents types
        Produit pomme = new ProduitAlimentaire("Pomme", 1.5);
        Produit smartphone = new ProduitElectronique("Smartphone", 800);
        Produit tShirt = new ProduitVetement("T-shirt", 25);
        Produit roman = new ProduitLivre("Roman", 15);
        
        // Création du calculateur de taxes
        CalculateurTaxes calculateur = new CalculateurTaxes();
        
        // Calcul et affichage des taxes et prix totaux pour chaque produit
        afficherDetails(calculateur, pomme);
        afficherDetails(calculateur, smartphone);
        afficherDetails(calculateur, tShirt);
        afficherDetails(calculateur, roman);

        
        // Ajout d'un nouveau type de produit sans modifier la classe CalculateurTaxes
        // Ce qui respecte le principe Ouvert/Fermé
        Produit table = new ProduitMeuble("Table", 150);
        afficherDetails(calculateur, table);
    }
    
    /**
     * Affiche les détails d'un produit, sa taxe et son prix total.
     * 
     * @param calculateur Le calculateur de taxes
     * @param produit Le produit à afficher
     */
    private static void afficherDetails(CalculateurTaxes calculateur, Produit produit) {
        double taxe = produit.calculerTaxe();
        double prixTotal = calculateur.calculerPrixTotal(produit);
        
        System.out.println("Produit: " + produit.getNom() + " (" + produit.getType() + ")");
        System.out.println("Prix: " + produit.getPrix() + "€");
        System.out.println("Taxe: " + taxe + "€");
        System.out.println("Prix total: " + prixTotal + "€");
        System.out.println();
    }
} 