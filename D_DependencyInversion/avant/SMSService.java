/**
 * Classe qui gère l'envoi de notifications par SMS.
 */
public class SMSService {
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