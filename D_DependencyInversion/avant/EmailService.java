/**
 * Classe qui gère l'envoi de notifications par email.
 */
public class EmailService {
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