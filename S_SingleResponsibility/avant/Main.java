public class Main {
    public static void main(String[] args) {
        // Création d'un employé
        Employe employe = new Employe("E001", "Jean Dupont", "jean.dupont@entreprise.com", 3000.0, "Développement");
        
        // Définition des heures travaillées
        employe.setHeuresTravaillees(45);
        
        // Ajout de performances
        employe.ajouterPerformance("Bon");
        employe.ajouterPerformance("Excellent");
        
        // Calcul du salaire
        double salaire = employe.calculerSalaire();
        System.out.println("Salaire calculé pour " + employe.getNom() + ": " + salaire + "€");
        
        // Génération d'un rapport
        String rapport = employe.genererRapport();
        System.out.println("\n" + rapport);
        
        // Sauvegarde des données
        employe.sauvegarderDonnees("employes.csv");
        
        // Envoi d'un email
        employe.envoyerEmail("Augmentation de salaire", "Félicitations pour votre augmentation de salaire !");
        
        // Analyse des performances
        String analyse = employe.analyserPerformance();
        System.out.println("\n" + analyse);
    }
} 