/**
 * Classe représentant une imprimante photo qui peut imprimer des documents et imprimer recto-verso.
 * Cette classe respecte le principe de Ségrégation des Interfaces en n'implémentant
 * que les interfaces correspondant aux fonctionnalités qu'elle supporte réellement.
 */
public class ImprimantePhoto implements Imprimable, ImprimableRectoVerso, Consommable {
    private int niveauEncre;
    private int niveauPapier;
    
    public ImprimantePhoto() {
        this.niveauEncre = 100;
        this.niveauPapier = 30;
    }
    
    @Override
    public boolean imprimer(String document) {
        if (niveauEncre > 0 && niveauPapier > 0) {
            System.out.println("Impression photo du document: " + document);
            niveauEncre -= 2; // Les photos utilisent plus d'encre
            niveauPapier -= 1;
            return true;
        } else {
            System.out.println("Impossible d'imprimer: niveau d'encre ou de papier insuffisant");
            return false;
        }
    }
    
    @Override
    public boolean imprimerRectoVerso(String document) {
        if (niveauEncre > 3 && niveauPapier > 0) {
            System.out.println("Impression photo recto-verso du document: " + document);
            niveauEncre -= 4; // Les photos recto-verso utilisent encore plus d'encre
            niveauPapier -= 1;
            return true;
        } else {
            System.out.println("Impossible d'imprimer recto-verso: niveau d'encre ou de papier insuffisant");
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