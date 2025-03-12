/**
 * Interface qui définit les méthodes pour envoyer des notifications.
 * Cette interface respecte le principe d'Inversion des Dépendances en fournissant
 * une abstraction dont dépendent les modules de haut niveau.
 */
public interface ServiceNotification {
    boolean envoyer(String destinataire, String contenu);
} 