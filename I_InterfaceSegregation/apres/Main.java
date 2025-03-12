/**
 * Classe principale qui démontre l'utilisation des imprimantes avec les interfaces séparées.
 */
public class Main {
    public static void main(String[] args) {
        // Création d'une imprimante simple
        ImprimanteSimple imprimanteSimple = new ImprimanteSimple();
        
        // Utilisation de l'imprimante simple
        System.out.println("=== Imprimante Simple ===");
        imprimanteSimple.imprimer("Document test");
        System.out.println("Niveau d'encre: " + imprimanteSimple.verifierNiveauEncre() + "%");
        System.out.println("Niveau de papier: " + imprimanteSimple.verifierNiveauPapier() + " feuilles");
        
        // Création d'une imprimante photo
        ImprimantePhoto imprimantePhoto = new ImprimantePhoto();
        
        // Utilisation de l'imprimante photo
        System.out.println("\n=== Imprimante Photo ===");
        imprimantePhoto.imprimer("Photo test");
        imprimantePhoto.imprimerRectoVerso("Photo recto-verso");
        System.out.println("Niveau d'encre: " + imprimantePhoto.verifierNiveauEncre() + "%");
        System.out.println("Niveau de papier: " + imprimantePhoto.verifierNiveauPapier() + " feuilles");
        
        // Création d'une imprimante multifonction
        ImprimanteMultifonction imprimanteMultifonction = new ImprimanteMultifonction();
        
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
        
        // Démonstration de l'utilisation des interfaces séparées
        System.out.println("\n=== Démonstration de l'utilisation des interfaces séparées ===");
        
        // On peut passer n'importe quelle imprimante à une méthode qui attend un Imprimable
        imprimer(imprimanteSimple, "Document via interface Imprimable");
        imprimer(imprimantePhoto, "Photo via interface Imprimable");
        imprimer(imprimanteMultifonction, "Document via interface Imprimable");
        
        // On ne peut passer que les imprimantes qui supportent l'impression recto-verso
        // à une méthode qui attend un ImprimableRectoVerso
        imprimerRectoVerso(imprimantePhoto, "Photo recto-verso via interface ImprimableRectoVerso");
        imprimerRectoVerso(imprimanteMultifonction, "Document recto-verso via interface ImprimableRectoVerso");
        
        // On ne peut passer que les imprimantes qui supportent la numérisation
        // à une méthode qui attend un Numerisable
        numeriser(imprimanteMultifonction);
    }
    
    /**
     * Méthode qui imprime un document sur n'importe quelle imprimante.
     * 
     * @param imprimable L'imprimante sur laquelle imprimer
     * @param document Le document à imprimer
     */
    public static void imprimer(Imprimable imprimable, String document) {
        System.out.println("\nImpression via interface Imprimable:");
        imprimable.imprimer(document);
    }
    
    /**
     * Méthode qui imprime un document recto-verso sur une imprimante qui supporte cette fonctionnalité.
     * 
     * @param imprimableRectoVerso L'imprimante sur laquelle imprimer
     * @param document Le document à imprimer
     */
    public static void imprimerRectoVerso(ImprimableRectoVerso imprimableRectoVerso, String document) {
        System.out.println("\nImpression recto-verso via interface ImprimableRectoVerso:");
        imprimableRectoVerso.imprimerRectoVerso(document);
    }
    
    /**
     * Méthode qui numérise un document sur un numériseur.
     * 
     * @param numerisable Le numériseur à utiliser
     */
    public static void numeriser(Numerisable numerisable) {
        System.out.println("\nNumérisation via interface Numerisable:");
        String document = numerisable.numeriser();
        System.out.println("Document numérisé: " + document);
    }
} 