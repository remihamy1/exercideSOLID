/**
 * Classe représentant une imprimante multifonction qui peut imprimer, numériser, faxer, etc.
 * Cette classe respecte le principe de Ségrégation des Interfaces en implémentant
 * toutes les interfaces correspondant aux fonctionnalités qu'elle supporte.
 */
public class ImprimanteMultifonction implements Imprimable, Numerisable, Faxable, 
                                               ImprimableRectoVerso, Agrafable, Consommable {
    private int niveauEncre;
    private int niveauPapier;
    private boolean agrafeuse;
    
    public ImprimanteMultifonction() {
        this.niveauEncre = 100;
        this.niveauPapier = 100;
        this.agrafeuse = true;
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
    public String numeriser() {
        System.out.println("Numérisation d'un document");
        return "Document numérisé";
    }
    
    @Override
    public boolean faxer(String document, String destinataire) {
        System.out.println("Envoi d'un fax à " + destinataire + ": " + document);
        return true;
    }
    
    @Override
    public boolean imprimerRectoVerso(String document) {
        if (niveauEncre > 1 && niveauPapier > 0) {
            System.out.println("Impression recto-verso du document: " + document);
            niveauEncre -= 2;
            niveauPapier -= 1;
            return true;
        } else {
            System.out.println("Impossible d'imprimer recto-verso: niveau d'encre ou de papier insuffisant");
            return false;
        }
    }
    
    @Override
    public boolean agrafer() {
        if (agrafeuse) {
            System.out.println("Agrafage des documents");
            return true;
        } else {
            System.out.println("Impossible d'agrafer: agrafeuse non disponible");
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