import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui gère l'envoi de notifications aux utilisateurs.
 * Cette classe respecte le principe d'Inversion des Dépendances car elle dépend
 * de l'interface ServiceNotification plutôt que des classes concrètes.
 */
public class GestionnaireNotification {
    private List<ServiceNotification> servicesNotification;

    public GestionnaireNotification() {
        this.servicesNotification = new ArrayList<>();
    }

    public GestionnaireNotification(List<ServiceNotification> servicesNotification) {
        this.servicesNotification = servicesNotification;
    }

    public void ajouterServiceNotification(ServiceNotification serviceNotification) {
        servicesNotification.add(serviceNotification);
    }

    public boolean notifierTous(String destinataire, String contenu) {
        boolean auMoinsUneNotificationEnvoyee = false;
        
        for (ServiceNotification service : servicesNotification) {
            boolean notificationEnvoyee = service.envoyer(destinataire, contenu);
            auMoinsUneNotificationEnvoyee = auMoinsUneNotificationEnvoyee || notificationEnvoyee;
        }
        
        return auMoinsUneNotificationEnvoyee;
    }

    public boolean notifier(int serviceIndex, String destinataire, String contenu) {
        if (serviceIndex >= 0 && serviceIndex < servicesNotification.size()) {
            return servicesNotification.get(serviceIndex).envoyer(destinataire, contenu);
        }
        return false;
    }
} 