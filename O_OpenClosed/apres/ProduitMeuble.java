/**
 * Classe représentant un produit de type meuble.
 * Cette classe a été ajoutée sans modifier le calculateur de taxes,
 * ce qui respecte le principe Ouvert/Fermé.
 */
public class ProduitMeuble extends ProduitBase {
    
    public ProduitMeuble(String nom, double prix) {
        super(nom, prix, "Meuble");
    }
    
    @Override
    public double calculerTaxe() {
        // Les meubles ont une taxe de 18%
        return getPrix() * 0.18;
    }
} 