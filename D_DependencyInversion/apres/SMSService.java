/**
 * Classe qui gère l'envoi de notifications par SMS.
 * Cette classe implémente l'interface ServiceNotification, ce qui respecte
 * le principe d'Inversion des Dépendances.
 */
public class SMSService implements ServiceNotification {
    /**
     * Envoie une notification par SMS.
     * 
     * @param destinataire Le numéro de téléphone du destinataire
     * @param contenu Le contenu du SMS
     * @return true si le SMS a été envoyé avec succès, false sinon
     */
    @Override
    public boolean envoyer(String destinataire, String contenu) {
        return envoyerSMS(destinataire, contenu);
    }
    
    /**
     * Envoie un SMS à un utilisateur.
     * 
     * @param numeroTelephone Le numéro de téléphone du destinataire
     * @param message Le message à envoyer
     * @return true si le SMS a été envoyé avec succès, false sinon
     */
    public boolean envoyerSMS(String numeroTelephone, String message) {
        // Code pour se connecter au service de SMS et envoyer le message
        // (simulé ici pour simplifier)
        System.out.println("Envoi d'un SMS au " + numeroTelephone);
        System.out.println("Message: " + message);
        System.out.println("SMS envoyé avec succès!");
        return true;
    }
} 