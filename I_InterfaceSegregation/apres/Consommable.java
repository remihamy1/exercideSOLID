/**
 * Interface pour les appareils qui utilisent des consommables (encre, papier).
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées aux consommables.
 */
public interface Consommable {
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