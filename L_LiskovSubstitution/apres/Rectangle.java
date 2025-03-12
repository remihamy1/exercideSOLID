/**
 * Classe représentant un rectangle.
 * Cette implémentation respecte le principe de Substitution de Liskov.
 */
public class Rectangle implements Forme {
    private double largeur;
    private double hauteur;
    
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    public double getLargeur() {
        return largeur;
    }
    
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    
    public double getHauteur() {
        return hauteur;
    }
    
    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
    
    @Override
    public double calculerAire() {
        return largeur * hauteur;
    }
    
    @Override
    public double calculerPerimetre() {
        return 2 * (largeur + hauteur);
    }
    
    @Override
    public String toString() {
        return "Rectangle [largeur=" + largeur + ", hauteur=" + hauteur + "]";
    }
} 