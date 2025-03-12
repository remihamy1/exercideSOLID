import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Employe {
    private String id;
    private String nom;
    private String email;
    private double salaireBase;
    private String departement;
    private int heuresTravaillees;
    private double tauxHoraire;
    private List<String> historiquePerformance;

    public Employe(String id, String nom, String email, double salaireBase, String departement) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.salaireBase = salaireBase;
        this.departement = departement;
        this.heuresTravaillees = 0;
        this.tauxHoraire = 20.0; // Taux horaire par défaut
        this.historiquePerformance = new ArrayList<>();
    }

    // Getters et setters
    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getEmail() { return email; }
    public double getSalaireBase() { return salaireBase; }
    public String getDepartement() { return departement; }
    public int getHeuresTravaillees() { return heuresTravaillees; }
    public double getTauxHoraire() { return tauxHoraire; }

    public void setHeuresTravaillees(int heuresTravaillees) {
        this.heuresTravaillees = heuresTravaillees;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public void ajouterPerformance(String performance) {
        this.historiquePerformance.add(performance);
    }

    public double calculerSalaire() {
        double salaire = salaireBase;
        
        // Bonus basé sur les heures travaillées
        if (heuresTravaillees > 40) {
            int heuresSupplementaires = heuresTravaillees - 40;
            salaire += heuresSupplementaires * tauxHoraire * 1.5;
        }
        
        // Bonus basé sur le département
        if ("Ventes".equals(departement)) {
            salaire += 1000; // Bonus pour le département des ventes
        } else if ("Développement".equals(departement)) {
            salaire += 750; // Bonus pour le département de développement
        }
        
        // Bonus basé sur la performance
        if (!historiquePerformance.isEmpty()) {
            String dernierePerformance = historiquePerformance.get(historiquePerformance.size() - 1);
            if ("Excellent".equals(dernierePerformance)) {
                salaire *= 1.2; // Bonus de 20% pour une performance excellente
            } else if ("Bon".equals(dernierePerformance)) {
                salaire *= 1.1; // Bonus de 10% pour une bonne performance
            }
        }
        
        return salaire;
    }

    public void sauvegarderDonnees(String cheminFichier) {
        try (FileWriter writer = new FileWriter(cheminFichier, true)) {
            writer.write(id + "," + nom + "," + email + "," + salaireBase + "," + departement + "\n");
            System.out.println("Données de l'employé sauvegardées avec succès.");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde des données de l'employé : " + e.getMessage());
        }
    }

    public String genererRapport() {
        StringBuilder rapport = new StringBuilder();
        rapport.append("Rapport de l'employé\n");
        rapport.append("-------------------\n");
        rapport.append("ID: ").append(id).append("\n");
        rapport.append("Nom: ").append(nom).append("\n");
        rapport.append("Email: ").append(email).append("\n");
        rapport.append("Département: ").append(departement).append("\n");
        rapport.append("Salaire de base: ").append(salaireBase).append("€\n");
        rapport.append("Heures travaillées: ").append(heuresTravaillees).append("\n");
        rapport.append("Salaire calculé: ").append(calculerSalaire()).append("€\n");
        
        rapport.append("\nHistorique de performance:\n");
        if (historiquePerformance.isEmpty()) {
            rapport.append("Aucune donnée de performance disponible.\n");
        } else {
            for (int i = 0; i < historiquePerformance.size(); i++) {
                rapport.append(i + 1).append(". ").append(historiquePerformance.get(i)).append("\n");
            }
        }
        
        return rapport.toString();
    }

    public void envoyerEmail(String sujet, String contenu) {
        System.out.println("Envoi d'un email à " + email);
        System.out.println("Sujet: " + sujet);
        System.out.println("Contenu: " + contenu);
        
        // Code pour se connecter au serveur SMTP et envoyer l'email
        // (simulé ici pour simplifier)
        System.out.println("Email envoyé avec succès à " + email);
    }

    public String analyserPerformance() {
        if (historiquePerformance.isEmpty()) {
            return "Aucune donnée de performance disponible.";
        }
        
        int excellent = 0;
        int bon = 0;
        int moyen = 0;
        int faible = 0;
        
        for (String performance : historiquePerformance) {
            switch (performance) {
                case "Excellent":
                    excellent++;
                    break;
                case "Bon":
                    bon++;
                    break;
                case "Moyen":
                    moyen++;
                    break;
                case "Faible":
                    faible++;
                    break;
            }
        }
        
        StringBuilder analyse = new StringBuilder();
        analyse.append("Analyse de performance pour ").append(nom).append(":\n");
        analyse.append("Excellent: ").append(excellent).append(" (").append(excellent * 100.0 / historiquePerformance.size()).append("%)\n");
        analyse.append("Bon: ").append(bon).append(" (").append(bon * 100.0 / historiquePerformance.size()).append("%)\n");
        analyse.append("Moyen: ").append(moyen).append(" (").append(moyen * 100.0 / historiquePerformance.size()).append("%)\n");
        analyse.append("Faible: ").append(faible).append(" (").append(faible * 100.0 / historiquePerformance.size()).append("%)\n");
        
        return analyse.toString();
    }
} 