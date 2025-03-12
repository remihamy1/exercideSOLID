import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe SauvegardeDonnees qui a la responsabilité unique de sauvegarder les données des employés.
 */
public class SauvegardeDonnees {
    
    /**
     * Sauvegarde les données d'un employé dans un fichier CSV.
     * 
     * @param employe L'employé dont on veut sauvegarder les données
     * @param cheminFichier Le chemin du fichier où sauvegarder les données
     * @return true si la sauvegarde a réussi, false sinon
     */
    public boolean sauvegarderEmploye(Employe employe, String cheminFichier) {
        try (FileWriter writer = new FileWriter(cheminFichier, true)) {
            writer.write(employe.getId() + "," + 
                         employe.getNom() + "," + 
                         employe.getEmail() + "," + 
                         employe.getSalaireBase() + "," + 
                         employe.getDepartement() + "\n");
            System.out.println("Données de l'employé sauvegardées avec succès.");
            return true;
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde des données de l'employé : " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Sauvegarde les données de plusieurs employés dans un fichier CSV.
     * 
     * @param employes Les employés dont on veut sauvegarder les données
     * @param cheminFichier Le chemin du fichier où sauvegarder les données
     * @return Le nombre d'employés sauvegardés avec succès
     */
    public int sauvegarderEmployes(Employe[] employes, String cheminFichier) {
        int compteur = 0;
        for (Employe employe : employes) {
            if (sauvegarderEmploye(employe, cheminFichier)) {
                compteur++;
            }
        }
        return compteur;
    }
} 