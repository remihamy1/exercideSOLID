import java.util.List;

/**
 * Classe CalculateurSalaire qui a la responsabilité unique de calculer les salaires.
 */
public class CalculateurSalaire {
    
    /**
     * Calcule le salaire d'un employé en fonction de ses caractéristiques.
     * 
     * @param employe L'employé dont on veut calculer le salaire
     * @return Le salaire calculé
     */
    public double calculerSalaire(Employe employe) {
        double salaire = employe.getSalaireBase();
        
        // Bonus basé sur les heures travaillées
        if (employe.getHeuresTravaillees() > 40) {
            int heuresSupplementaires = employe.getHeuresTravaillees() - 40;
            salaire += heuresSupplementaires * employe.getTauxHoraire() * 1.5;
        }
        
        // Bonus basé sur le département
        if ("Ventes".equals(employe.getDepartement())) {
            salaire += 1000; // Bonus pour le département des ventes
        } else if ("Développement".equals(employe.getDepartement())) {
            salaire += 750; // Bonus pour le département de développement
        }
        
        // Bonus basé sur la performance
        List<String> historiquePerformance = employe.getHistoriquePerformance();
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
} 