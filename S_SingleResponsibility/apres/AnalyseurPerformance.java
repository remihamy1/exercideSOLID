import java.util.List;

public class AnalyseurPerformance {
    public String analyserPerformance(Employe employe) {
        List<String> historiquePerformance = employe.getHistoriquePerformance();
        
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
        analyse.append("Analyse de performance pour ").append(employe.getNom()).append(":\n");
        analyse.append("Excellent: ").append(excellent).append(" (").append(excellent * 100.0 / historiquePerformance.size()).append("%)\n");
        analyse.append("Bon: ").append(bon).append(" (").append(bon * 100.0 / historiquePerformance.size()).append("%)\n");
        analyse.append("Moyen: ").append(moyen).append(" (").append(moyen * 100.0 / historiquePerformance.size()).append("%)\n");
        analyse.append("Faible: ").append(faible).append(" (").append(faible * 100.0 / historiquePerformance.size()).append("%)\n");
        
        return analyse.toString();
    }
    
    public boolean meritePromotion(Employe employe) {
        List<String> historiquePerformance = employe.getHistoriquePerformance();
        
        if (historiquePerformance.size() < 3) {
            return false; // Pas assez de données pour décider
        }
        
        int excellent = 0;
        int bon = 0;
        
        for (int i = historiquePerformance.size() - 1; i >= Math.max(0, historiquePerformance.size() - 3); i--) {
            String performance = historiquePerformance.get(i);
            if ("Excellent".equals(performance)) {
                excellent++;
            } else if ("Bon".equals(performance)) {
                bon++;
            }
        }
        
        return excellent >= 2 || (excellent + bon) >= 3;
    }
} 