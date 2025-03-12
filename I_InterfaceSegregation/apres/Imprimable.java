/**
 * Interface pour les appareils qui peuvent imprimer des documents.
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées à l'impression.
 */
public interface Imprimable {
    /**
     * Imprime un document.
     * 
     * @param document Le document à imprimer
     * @return true si l'impression a réussi, false sinon
     */
    boolean imprimer(String document);
} 