/**
 * Interface pour les appareils qui peuvent agrafer des documents.
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées à l'agrafage.
 */
public interface Agrafable {
    /**
     * Agrafe les documents imprimés.
     * 
     * @return true si l'agrafage a réussi, false sinon
     */
    boolean agrafer();
} 