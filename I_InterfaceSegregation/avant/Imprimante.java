/**
 * Interface Imprimante qui viole le principe de Ségrégation des Interfaces
 * en définissant toutes les fonctionnalités possibles pour tous les types d'imprimantes.
 * Cela force les classes qui implémentent cette interface à fournir des implémentations
 * pour des méthodes qu'elles ne peuvent pas réellement supporter.
 */
public interface Imprimante {
    /**
     * Imprime un document.
     * 
     * @param document Le document à imprimer
     * @return true si l'impression a réussi, false sinon
     */
    boolean imprimer(String document);
    
    /**
     * Numérise un document.
     * 
     * @return Le document numérisé sous forme de chaîne de caractères
     */
    String numeriser();
    
    /**
     * Envoie un fax.
     * 
     * @param document Le document à faxer
     * @param destinataire Le numéro de fax du destinataire
     * @return true si l'envoi a réussi, false sinon
     */
    boolean faxer(String document, String destinataire);
    
    /**
     * Imprime un document recto-verso.
     * 
     * @param document Le document à imprimer
     * @return true si l'impression a réussi, false sinon
     */
    boolean imprimerRectoVerso(String document);
    
    /**
     * Agrafe les documents imprimés.
     * 
     * @return true si l'agrafage a réussi, false sinon
     */
    boolean agrafer();
    
    /**
     * Vérifie le niveau d'encre.
     * 
     * @return Le niveau d'encre en pourcentage
     */
    int verifierNiveauEncre();
    
    /**
     * Vérifie le niveau de papier.
     * 
     * @return Le nombre de feuilles de papier restantes
     */
    int verifierNiveauPapier();
} 