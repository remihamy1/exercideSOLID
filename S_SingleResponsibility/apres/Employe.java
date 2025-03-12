import java.util.ArrayList;
import java.util.List;

/**
 * Classe Employe refactorisée qui respecte le principe de Responsabilité Unique
 * en ne s'occupant que des données de l'employé.
 */
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
    public List<String> getHistoriquePerformance() { 
        return new ArrayList<>(historiquePerformance); // Retourne une copie pour éviter la modification directe
    }

    public void setHeuresTravaillees(int heuresTravaillees) {
        this.heuresTravaillees = heuresTravaillees;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public void ajouterPerformance(String performance) {
        this.historiquePerformance.add(performance);
    }
} 