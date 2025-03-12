/**
 * Classe qui gère l'envoi de notifications par email.
 * Cette classe implémente l'interface ServiceNotification, ce qui respecte
 * le principe d'Inversion des Dépendances.
 */
public class EmailService implements ServiceNotification {

    @Override
    public boolean envoyer(String destinataire, String contenu) {
        return envoyerEmail(destinataire, "Notification", contenu);
    }

    public boolean envoyerEmail(String destinataire, String sujet, String contenu) {
        // Code pour se connecter au serveur SMTP et envoyer l'email
        System.out.println("Envoi d'un email à " + destinataire);
        System.out.println("Sujet: " + sujet);
        System.out.println("Contenu: " + contenu);
        System.out.println("Email envoyé avec succès!");
        return true;
    }
} 