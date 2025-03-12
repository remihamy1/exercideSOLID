/**
 * Interface pour les appareils qui peuvent imprimer des documents recto-verso.
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées à l'impression recto-verso.
 */
public interface ImprimableRectoVerso {

    boolean imprimerRectoVerso(String document);
} 