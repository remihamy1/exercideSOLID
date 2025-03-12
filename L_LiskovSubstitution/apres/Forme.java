/**
 * Interface pour les formes géométriques.
 * Cette approche respecte le principe de Substitution de Liskov car
 * chaque forme implémente les méthodes de calcul d'aire et de périmètre
 * sans imposer de contraintes supplémentaires.
 */
public interface Forme {

    double calculerAire();
    

    double calculerPerimetre();
} 