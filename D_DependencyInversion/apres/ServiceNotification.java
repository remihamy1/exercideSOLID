/**
 * Interface qui définit les méthodes pour envoyer des notifications.
 * Cette interface respecte le principe d'Inversion des Dépendances en fournissant
 * une abstraction dont dépendent les modules de haut niveau.
 */
public interface ServiceNotification {
    /**
     * Envoie une notification.
     * 
     * @param destinataire Le destinataire de la notification
     * @param contenu Le contenu de la notification
     * @return true si la notification a été envoyée avec succès, false sinon
     */
    boolean envoyer(String destinataire, String contenu);
} 