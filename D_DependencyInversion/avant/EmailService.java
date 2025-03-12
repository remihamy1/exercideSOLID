/**
 * Classe qui gère l'envoi de notifications par email.
 */
public class EmailService {
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