public class Carre extends Rectangle {
    
    public Carre(double cote) {
        super(cote, cote);
    }
    
    @Override
    public void setLargeur(double largeur) {
        super.setLargeur(largeur);
        super.setHauteur(largeur);
    }
    
    @Override
    public void setHauteur(double hauteur) {
        super.setHauteur(hauteur);
        super.setLargeur(hauteur);
    }
    
    public void setCote(double cote) {
        super.setLargeur(cote);
        super.setHauteur(cote);
    }
    
    public double getCote() {
        return getLargeur(); // ou getHauteur(), les deux sont égaux
    }
    
    @Override
    public String toString() {
        return "Carre [cote=" + getLargeur() + "]";
    }
} 