/**
 * Classe qui gère l'envoi de notifications push.
 * Cette classe implémente l'interface ServiceNotification, ce qui respecte
 * le principe d'Inversion des Dépendances.
 */
public class NotificationPushService implements ServiceNotification {
    /**
     * Envoie une notification push.
     * 
     * @param destinataire L'identifiant de l'appareil du destinataire
     * @param contenu Le contenu de la notification
     * @return true si la notification a été envoyée avec succès, false sinon
     */
    @Override
    public boolean envoyer(String destinataire, String contenu) {
        return envoyerNotificationPush(destinataire, contenu);
    }
    
    /**
     * Envoie une notification push à un utilisateur.
     * 
     * @param idAppareil L'identifiant de l'appareil du destinataire
     * @param message Le message à envoyer
     * @return true si la notification a été envoyée avec succès, false sinon
     */
    public boolean envoyerNotificationPush(String idAppareil, String message) {
        // Code pour se connecter au service de notification push et envoyer le message
        // (simulé ici pour simplifier)
        System.out.println("Envoi d'une notification push à l'appareil " + idAppareil);
        System.out.println("Message: " + message);
        System.out.println("Notification push envoyée avec succès!");
        return true;
    }
} 