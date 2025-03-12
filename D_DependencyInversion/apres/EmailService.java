/**
 * Classe qui gère l'envoi de notifications par email.
 * Cette classe implémente l'interface ServiceNotification, ce qui respecte
 * le principe d'Inversion des Dépendances.
 */
public class EmailService implements ServiceNotification {
    /**
     * Envoie une notification par email.
     * 
     * @param destinataire L'adresse email du destinataire
     * @param contenu Le contenu de l'email
     * @return true si l'email a été envoyé avec succès, false sinon
     */
    @Override
    public boolean envoyer(String destinataire, String contenu) {
        return envoyerEmail(destinataire, "Notification", contenu);
    }
    
    /**
     * Envoie un email à un utilisateur.
     * 
     * @param destinataire L'adresse email du destinataire
     * @param sujet Le sujet de l'email
     * @param contenu Le contenu de l'email
     * @return true si l'email a été envoyé avec succès, false sinon
     */
    public boolean envoyerEmail(String destinataire, String sujet, String contenu) {
        // Code pour se connecter au serveur SMTP et envoyer l'email
        // (simulé ici pour simplifier)
        System.out.println("Envoi d'un email à " + destinataire);
        System.out.println("Sujet: " + sujet);
        System.out.println("Contenu: " + contenu);
        System.out.println("Email envoyé avec succès!");
        return true;
    }
} 