/**
 * Classe principale qui démontre le respect du principe de Substitution de Liskov.
 */
public class Main {
    public static void main(String[] args) {
        // Création d'un rectangle
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle initial: " + rectangle);
        System.out.println("Aire: " + rectangle.calculerAire());
        System.out.println("Périmètre: " + rectangle.calculerPerimetre());
        
        // Modification du rectangle
        rectangle.setLargeur(7);
        rectangle.setHauteur(12);
        System.out.println("\nRectangle modifié: " + rectangle);
        System.out.println("Aire: " + rectangle.calculerAire());
        System.out.println("Périmètre: " + rectangle.calculerPerimetre());
        
        // Création d'un carré
        Carre carre = new Carre(5);
        System.out.println("\nCarré initial: " + carre);
        System.out.println("Aire: " + carre.calculerAire());
        System.out.println("Périmètre: " + carre.calculerPerimetre());
        
        // Modification du carré
        carre.setCote(7);
        System.out.println("\nCarré modifié: " + carre);
        System.out.println("Aire: " + carre.calculerAire());
        System.out.println("Périmètre: " + carre.calculerPerimetre());
        
        // Démonstration du respect du principe de Substitution de Liskov
        System.out.println("\n--- Démonstration du respect du principe de Substitution de Liskov ---");
        
        // Utilisation de l'interface Forme pour manipuler les formes de manière polymorphique
        Forme[] formes = new Forme[] {
            new Rectangle(5, 10),
            new Carre(5)
        };
        
        for (Forme forme : formes) {
            System.out.println("\nForme: " + forme);
            System.out.println("Aire: " + forme.calculerAire());
            System.out.println("Périmètre: " + forme.calculerPerimetre());
        }
        
        // Redimensionnement d'un rectangle
        Rectangle r = new Rectangle(5, 10);
        System.out.println("\nAvant redimensionnement: " + r);
        redimensionner(r, 2, 3);
        System.out.println("Après redimensionnement: " + r);
        System.out.println("Aire attendue: 2 * 3 = 6, Aire obtenue: " + r.calculerAire());
        
        // Nous ne pouvons plus passer un carré à la méthode redimensionner
        // car Carre n'est plus un sous-type de Rectangle
        // Cela évite les problèmes liés à la violation du principe de Substitution de Liskov
        
        // Redimensionnement d'un carré (en utilisant sa propre méthode)
        Carre c = new Carre(5);
        System.out.println("\nAvant redimensionnement: " + c);
        c.setCote(7);
        System.out.println("Après redimensionnement: " + c);
        System.out.println("Aire attendue: 7 * 7 = 49, Aire obtenue: " + c.calculerAire());
    }
    
    /**
     * Méthode qui redimensionne un rectangle en modifiant sa largeur et sa hauteur.
     * 
     * @param rectangle Le rectangle à redimensionner
     * @param largeur La nouvelle largeur
     * @param hauteur La nouvelle hauteur
     */
    public static void redimensionner(Rectangle rectangle, double largeur, double hauteur) {
        rectangle.setLargeur(largeur);
        rectangle.setHauteur(hauteur);
        
        // Vérification que le redimensionnement a bien fonctionné
        assert rectangle.getLargeur() == largeur : "La largeur n'a pas été correctement modifiée";
        assert rectangle.getHauteur() == hauteur : "La hauteur n'a pas été correctement modifiée";
    }
} 