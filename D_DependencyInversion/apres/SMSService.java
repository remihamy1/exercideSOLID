/**
 * Classe qui gère l'envoi de notifications par SMS.
 * Cette classe implémente l'interface ServiceNotification, ce qui respecte
 * le principe d'Inversion des Dépendances.
 */
public class SMSService implements ServiceNotification {

    @Override
    public boolean envoyer(String destinataire, String contenu) {
        return envoyerSMS(destinataire, contenu);
    }
    public boolean envoyerSMS(String numeroTelephone, String message) {
        // Code pour se connecter au service de SMS et envoyer le message
        // (simulé ici pour simplifier)
        System.out.println("Envoi d'un SMS au " + numeroTelephone);
        System.out.println("Message: " + message);
        System.out.println("SMS envoyé avec succès!");
        return true;
    }
} 