/**
 * Interface pour les appareils qui utilisent des consommables (encre, papier).
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées aux consommables.
 */
public interface Consommable {

    int verifierNiveauEncre();

    int verifierNiveauPapier();
} 