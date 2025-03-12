/**
 * Classe principale qui démontre l'utilisation des imprimantes.
 */
public class Main {
    public static void main(String[] args) {
        // Création d'une imprimante simple
        Imprimante imprimanteSimple = new ImprimanteSimple();
        
        // Utilisation de l'imprimante simple
        System.out.println("=== Imprimante Simple ===");
        imprimanteSimple.imprimer("Document test");
        System.out.println("Niveau d'encre: " + imprimanteSimple.verifierNiveauEncre() + "%");
        System.out.println("Niveau de papier: " + imprimanteSimple.verifierNiveauPapier() + " feuilles");
        
        // Tentative d'utilisation de fonctionnalités non supportées
        try {
            imprimanteSimple.numeriser();
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
        
        try {
            imprimanteSimple.faxer("Document test", "123456789");
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
        
        // Création d'une imprimante multifonction
        Imprimante imprimanteMultifonction = new ImprimanteMultifonction();
        
        // Utilisation de l'imprimante multifonction
        System.out.println("\n=== Imprimante Multifonction ===");
        imprimanteMultifonction.imprimer("Document test");
        String documentNumerise = imprimanteMultifonction.numeriser();
        System.out.println("Document numérisé: " + documentNumerise);
        imprimanteMultifonction.faxer("Document test", "123456789");
        imprimanteMultifonction.imprimerRectoVerso("Document recto-verso");
        imprimanteMultifonction.agrafer();
        System.out.println("Niveau d'encre: " + imprimanteMultifonction.verifierNiveauEncre() + "%");
        System.out.println("Niveau de papier: " + imprimanteMultifonction.verifierNiveauPapier() + " feuilles");
    }
} 