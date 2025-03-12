public class ImprimanteSimple implements Imprimante {
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
    public String numeriser() {
        throw new UnsupportedOperationException("Cette imprimante ne peut pas numériser");
    }
    
    @Override
    public boolean faxer(String document, String destinataire) {
        throw new UnsupportedOperationException("Cette imprimante ne peut pas faxer");
    }
    
    @Override
    public boolean imprimerRectoVerso(String document) {
        throw new UnsupportedOperationException("Cette imprimante ne peut pas imprimer recto-verso");
    }
    
    @Override
    public boolean agrafer() {
        throw new UnsupportedOperationException("Cette imprimante ne peut pas agrafer");
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