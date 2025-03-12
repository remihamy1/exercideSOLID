/**
 * Classe qui gère l'envoi de notifications push.
 * Cette classe implémente l'interface ServiceNotification, ce qui respecte
 * le principe d'Inversion des Dépendances.
 */
public class NotificationPushService implements ServiceNotification {
    @Override
    public boolean envoyer(String destinataire, String contenu) {
        return envoyerNotificationPush(destinataire, contenu);
    }

    public boolean envoyerNotificationPush(String idAppareil, String message) {
        // Code pour se connecter au service de notification push et envoyer le message
        System.out.println("Envoi d'une notification push à l'appareil " + idAppareil);
        System.out.println("Message: " + message);
        System.out.println("Notification push envoyée avec succès!");
        return true;
    }
} 