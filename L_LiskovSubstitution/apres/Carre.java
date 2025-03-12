/**
 * Classe représentant un carré.
 * Cette implémentation respecte le principe de Substitution de Liskov
 * car elle n'hérite pas de Rectangle et définit son propre comportement.
 */
public class Carre implements Forme {
    private double cote;
    
    public Carre(double cote) {
        this.cote = cote;
    }
    
    public double getCote() {
        return cote;
    }
    
    public void setCote(double cote) {
        this.cote = cote;
    }
    
    @Override
    public double calculerAire() {
        return cote * cote;
    }
    
    @Override
    public double calculerPerimetre() {
        return 4 * cote;
    }
    
    @Override
    public String toString() {
        return "Carre [cote=" + cote + "]";
    }
} 