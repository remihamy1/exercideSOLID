public class ProduitAlimentaire extends ProduitBase {
    
    public ProduitAlimentaire(String nom, double prix) {
        super(nom, prix, "Alimentaire");
    }
    
    @Override
    public double calculerTaxe() {
        return getPrix() * 0.055;
    }
} 