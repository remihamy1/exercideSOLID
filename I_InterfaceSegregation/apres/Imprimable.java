/**
 * Interface pour les appareils qui peuvent imprimer des documents.
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées à l'impression.
 */
public interface Imprimable {

    boolean imprimer(String document);
} 