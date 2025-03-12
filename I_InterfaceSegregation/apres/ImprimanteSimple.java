/**
 * Classe représentant une imprimante simple qui ne peut qu'imprimer des documents.
 * Cette classe respecte le principe de Ségrégation des Interfaces en n'implémentant
 * que les interfaces correspondant aux fonctionnalités qu'elle supporte réellement.
 */
public class ImprimanteSimple implements Imprimable, Consommable {
    private int niveauEncre;
    private int niveauPapier;
    
    public ImprimanteSimple() {
        this.niveauEncre = 100;
        this.niveauPapier = 50;
    }
    
    @Override
    public boolean imprimer(String document) {
        if (niveauEncre > 0 && niveauPapier > 0) {
            System.out.println("Impression du document: " + document);
            niveauEncre -= 1;
            niveauPapier -= 1;
            return true;
        } else {
            System.out.println("Impossible d'imprimer: niveau d'encre ou de papier insuffisant");
            return false;
        }
    }
    
    @Override
    public int verifierNiveauEncre() {
        return niveauEncre;
    }
    
    @Override
    public int verifierNiveauPapier() {
        return niveauPapier;
    }
} 