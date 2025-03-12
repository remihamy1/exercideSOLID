/**
 * Interface pour les appareils qui peuvent imprimer des documents recto-verso.
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées à l'impression recto-verso.
 */
public interface ImprimableRectoVerso {
    /**
     * Imprime un document recto-verso.
     * 
     * @param document Le document à imprimer
     * @return true si l'impression a réussi, false sinon
     */
    boolean imprimerRectoVerso(String document);
} 