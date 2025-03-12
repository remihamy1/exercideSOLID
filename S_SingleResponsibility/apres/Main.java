public class Main {
    public static void main(String[] args) {
        // Création d'un employé
        Employe employe = new Employe("E001", "Jean Dupont", "jean.dupont@entreprise.com", 3000.0, "Développement");
        
        // Définition des heures travaillées
        employe.setHeuresTravaillees(45);
        
        // Ajout de performances
        employe.ajouterPerformance("Bon");
        employe.ajouterPerformance("Excellent");
        
        // Utilisation des classes spécialisées
        CalculateurSalaire calculateurSalaire = new CalculateurSalaire();
        GenerateurRapport generateurRapport = new GenerateurRapport(calculateurSalaire);
        SauvegardeDonnees sauvegardeDonnees = new SauvegardeDonnees();
        ServiceEmail serviceEmail = new ServiceEmail();
        AnalyseurPerformance analyseurPerformance = new AnalyseurPerformance();
        
        // Calcul du salaire
        double salaire = calculateurSalaire.calculerSalaire(employe);
        System.out.println("Salaire calculé pour " + employe.getNom() + ": " + salaire + "€");
        
        // Génération d'un rapport
        String rapport = generateurRapport.genererRapportDetaille(employe);
        System.out.println("\n" + rapport);
        
        // Sauvegarde des données
        sauvegardeDonnees.sauvegarderEmploye(employe, "employes.csv");
        
        // Envoi d'un email
        serviceEmail.envoyerEmail(employe, "Augmentation de salaire", "Félicitations pour votre augmentation de salaire !");
        
        // Analyse des performances
        String analyse = analyseurPerformance.analyserPerformance(employe);
        System.out.println("\n" + analyse);
        
        // Vérification si l'employé mérite une promotion
        boolean meritePromotion = analyseurPerformance.meritePromotion(employe);
        System.out.println("\nL'employé mérite-t-il une promotion ? " + (meritePromotion ? "Oui" : "Non"));
    }
} 