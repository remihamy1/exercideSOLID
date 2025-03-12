public class CalculateurTaxes {
    
    public double calculerTaxe(Produit produit) {
        // Violation du principe Ouvert/Fermé : on doit modifier cette méthode
        // chaque fois qu'un nouveau type de produit est ajouté
        if ("Alimentaire".equals(produit.getType())) {
            // Les produits alimentaires ont une taxe de 5.5%
            return produit.getPrix() * 0.055;
        } else if ("Electronique".equals(produit.getType())) {
            // Les produits électroniques ont une taxe de 20%
            return produit.getPrix() * 0.2;
        } else if ("Vetement".equals(produit.getType())) {
            // Les vêtements ont une taxe de 10%
            return produit.getPrix() * 0.1;
        } else if ("Livre".equals(produit.getType())) {
            // Les livres ont une taxe de 5%
            return produit.getPrix() * 0.05;
        } else {
            // Taxe par défaut de 15%
            return produit.getPrix() * 0.15;
        }
    }
    
    public double calculerPrixTotal(Produit produit) {
        return produit.getPrix() + calculerTaxe(produit);
    }
} 