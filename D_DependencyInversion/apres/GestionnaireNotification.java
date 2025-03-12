import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui gère l'envoi de notifications aux utilisateurs.
 * Cette classe respecte le principe d'Inversion des Dépendances car elle dépend
 * de l'interface ServiceNotification plutôt que des classes concrètes.
 */
public class GestionnaireNotification {
    private List<ServiceNotification> servicesNotification;
    
    /**
     * Constructeur qui initialise la liste des services de notification.
     */
    public GestionnaireNotification() {
        this.servicesNotification = new ArrayList<>();
    }
    
    /**
     * Constructeur qui initialise la liste des services de notification avec les services fournis.
     * 
     * @param servicesNotification Les services de notification à utiliser
     */
    public GestionnaireNotification(List<ServiceNotification> servicesNotification) {
        this.servicesNotification = servicesNotification;
    }
    
    /**
     * Ajoute un service de notification.
     * 
     * @param serviceNotification Le service de notification à ajouter
     */
    public void ajouterServiceNotification(ServiceNotification serviceNotification) {
        servicesNotification.add(serviceNotification);
    }
    
    /**
     * Envoie une notification via tous les services de notification disponibles.
     * 
     * @param destinataire Le destinataire de la notification
     * @param contenu Le contenu de la notification
     * @return true si au moins une notification a été envoyée avec succès, false sinon
     */
    public boolean notifierTous(String destinataire, String contenu) {
        boolean auMoinsUneNotificationEnvoyee = false;
        
        for (ServiceNotification service : servicesNotification) {
            boolean notificationEnvoyee = service.envoyer(destinataire, contenu);
            auMoinsUneNotificationEnvoyee = auMoinsUneNotificationEnvoyee || notificationEnvoyee;
        }
        
        return auMoinsUneNotificationEnvoyee;
    }
    
    /**
     * Envoie une notification via un service de notification spécifique.
     * 
     * @param serviceIndex L'index du service de notification à utiliser
     * @param destinataire Le destinataire de la notification
     * @param contenu Le contenu de la notification
     * @return true si la notification a été envoyée avec succès, false sinon
     */
    public boolean notifier(int serviceIndex, String destinataire, String contenu) {
        if (serviceIndex >= 0 && serviceIndex < servicesNotification.size()) {
            return servicesNotification.get(serviceIndex).envoyer(destinataire, contenu);
        }
        return false;
    }
} 