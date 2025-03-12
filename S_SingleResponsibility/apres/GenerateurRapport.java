import java.util.List;

/**
 * Classe GenerateurRapport qui a la responsabilité unique de générer des rapports sur les employés.
 */
public class GenerateurRapport {
    
    private final CalculateurSalaire calculateurSalaire;
    
    public GenerateurRapport(CalculateurSalaire calculateurSalaire) {
        this.calculateurSalaire = calculateurSalaire;
    }
    
    /**
     * Génère un rapport détaillé sur un employé.
     * 
     * @param employe L'employé pour lequel générer le rapport
     * @return Le rapport généré sous forme de chaîne de caractères
     */
    public String genererRapportDetaille(Employe employe) {
        StringBuilder rapport = new StringBuilder();
        rapport.append("Rapport de l'employé\n");
        rapport.append("-------------------\n");
        rapport.append("ID: ").append(employe.getId()).append("\n");
        rapport.append("Nom: ").append(employe.getNom()).append("\n");
        rapport.append("Email: ").append(employe.getEmail()).append("\n");
        rapport.append("Département: ").append(employe.getDepartement()).append("\n");
        rapport.append("Salaire de base: ").append(employe.getSalaireBase()).append("€\n");
        rapport.append("Heures travaillées: ").append(employe.getHeuresTravaillees()).append("\n");
        rapport.append("Salaire calculé: ").append(calculateurSalaire.calculerSalaire(employe)).append("€\n");
        
        rapport.append("\nHistorique de performance:\n");
        List<String> historiquePerformance = employe.getHistoriquePerformance();
        if (historiquePerformance.isEmpty()) {
            rapport.append("Aucune donnée de performance disponible.\n");
        } else {
            for (int i = 0; i < historiquePerformance.size(); i++) {
                rapport.append(i + 1).append(". ").append(historiquePerformance.get(i)).append("\n");
            }
        }
        
        return rapport.toString();
    }
    
    /**
     * Génère un rapport simplifié sur un employé.
     * 
     * @param employe L'employé pour lequel générer le rapport
     * @return Le rapport simplifié généré sous forme de chaîne de caractères
     */
    public String genererRapportSimplifie(Employe employe) {
        return "Employé: " + employe.getNom() + 
               " (ID: " + employe.getId() + "), " + 
               "Département: " + employe.getDepartement() + ", " + 
               "Salaire: " + calculateurSalaire.calculerSalaire(employe) + "€";
    }
} 