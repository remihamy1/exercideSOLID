/**
 * Interface pour les appareils qui peuvent numériser des documents.
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées à la numérisation.
 */
public interface Numerisable {

    String numeriser();
} 