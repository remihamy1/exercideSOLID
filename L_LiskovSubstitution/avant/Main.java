public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle initial: " + rectangle);
        System.out.println("Aire: " + rectangle.calculerAire());
        System.out.println("Périmètre: " + rectangle.calculerPerimetre());
        
        rectangle.setLargeur(7);
        rectangle.setHauteur(12);
        System.out.println("\nRectangle modifié: " + rectangle);
        System.out.println("Aire: " + rectangle.calculerAire());
        System.out.println("Périmètre: " + rectangle.calculerPerimetre());
        
        Carre carre = new Carre(5);
        System.out.println("\nCarré initial: " + carre);
        System.out.println("Aire: " + carre.calculerAire());
        System.out.println("Périmètre: " + carre.calculerPerimetre());
        
        carre.setCote(7);
        System.out.println("\nCarré modifié: " + carre);
        System.out.println("Aire: " + carre.calculerAire());
        System.out.println("Périmètre: " + carre.calculerPerimetre());
        

        Rectangle r = new Rectangle(5, 10);
        System.out.println("Avant redimensionnement: " + r);
        redimensionner(r, 2, 3);
        System.out.println("Après redimensionnement: " + r);
        System.out.println("Aire attendue: 2 * 3 = 6, Aire obtenue: " + r.calculerAire());
        
        Rectangle c = new Carre(5);
        System.out.println("\nAvant redimensionnement: " + c);
        redimensionner(c, 2, 3);
        System.out.println(c.calculerAire());
        System.out.println("Après redimensionnement: " + c);
    }


    public static void redimensionner(Rectangle rectangle, double largeur, double hauteur) {
        rectangle.setLargeur(largeur);
        rectangle.setHauteur(hauteur);
    }
} 