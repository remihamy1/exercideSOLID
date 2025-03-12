/**
 * Interface pour les formes géométriques.
 * Cette approche respecte le principe de Substitution de Liskov car
 * chaque forme implémente les méthodes de calcul d'aire et de périmètre
 * sans imposer de contraintes supplémentaires.
 */
public interface Forme {
    /**
     * Calcule l'aire de la forme.
     * 
     * @return L'aire de la forme
     */
    double calculerAire();
    
    /**
     * Calcule le périmètre de la forme.
     * 
     * @return Le périmètre de la forme
     */
    double calculerPerimetre();
} 