/**
 * Classe principale qui démontre l'utilisation du calculateur de taxes.
 */
public class Main {
    public static void main(String[] args) {
        // Création de produits de différents types
        Produit pomme = new Produit("Pomme", 1.5, "Alimentaire");
        Produit smartphone = new Produit("Smartphone", 800, "Electronique");
        Produit tShirt = new Produit("T-shirt", 25, "Vetement");
        Produit roman = new Produit("Roman", 15, "Livre");
        
        // Création du calculateur de taxes
        CalculateurTaxes calculateur = new CalculateurTaxes();
        
        // Calcul et affichage des taxes et prix totaux pour chaque produit
        afficherDetails(calculateur, pomme);
        afficherDetails(calculateur, smartphone);
        afficherDetails(calculateur, tShirt);
        afficherDetails(calculateur, roman);
        
        // Si on veut ajouter un nouveau type de produit, par exemple "Meuble",
        // il faudrait modifier la classe CalculateurTaxes pour ajouter une nouvelle condition,
        // ce qui viole le principe Ouvert/Fermé
        Produit table = new Produit("Table", 150, "Meuble");
        afficherDetails(calculateur, table); // Utilisera la taxe par défaut de 15%
    }
    
    /**
     * Affiche les détails d'un produit, sa taxe et son prix total.
     * 
     * @param calculateur Le calculateur de taxes
     * @param produit Le produit à afficher
     */
    private static void afficherDetails(CalculateurTaxes calculateur, Produit produit) {
        double taxe = calculateur.calculerTaxe(produit);
        double prixTotal = calculateur.calculerPrixTotal(produit);
        
        System.out.println("Produit: " + produit.getNom() + " (" + produit.getType() + ")");
        System.out.println("Prix: " + produit.getPrix() + "€");
        System.out.println("Taxe: " + taxe + "€");
        System.out.println("Prix total: " + prixTotal + "€");
        System.out.println();
    }
} 