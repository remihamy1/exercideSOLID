/**
 * Classe qui gère l'envoi de notifications aux utilisateurs.
 * Cette classe viole le principe d'Inversion des Dépendances car elle dépend
 * directement des classes concrètes EmailService et SMSService.
 */
public class ServiceNotification {
    private EmailService emailService;
    private SMSService smsService;
    
    /**
     * Constructeur qui initialise les services de notification.
     */
    public ServiceNotification() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }
    
    /**
     * Envoie une notification par email.
     * 
     * @param destinataire L'adresse email du destinataire
     * @param sujet Le sujet de l'email
     * @param contenu Le contenu de l'email
     * @return true si la notification a été envoyée avec succès, false sinon
     */
    public boolean notifierParEmail(String destinataire, String sujet, String contenu) {
        return emailService.envoyerEmail(destinataire, sujet, contenu);
    }
    
    /**
     * Envoie une notification par SMS.
     * 
     * @param numeroTelephone Le numéro de téléphone du destinataire
     * @param message Le message à envoyer
     * @return true si la notification a été envoyée avec succès, false sinon
     */
    public boolean notifierParSMS(String numeroTelephone, String message) {
        return smsService.envoyerSMS(numeroTelephone, message);
    }
    
    /**
     * Envoie une notification par email et par SMS.
     * 
     * @param emailDestinataire L'adresse email du destinataire
     * @param numeroTelephone Le numéro de téléphone du destinataire
     * @param sujet Le sujet de la notification
     * @param contenu Le contenu de la notification
     * @return true si les deux notifications ont été envoyées avec succès, false sinon
     */
    public boolean notifierParEmailEtSMS(String emailDestinataire, String numeroTelephone, String sujet, String contenu) {
        boolean emailEnvoye = emailService.envoyerEmail(emailDestinataire, sujet, contenu);
        boolean smsEnvoye = smsService.envoyerSMS(numeroTelephone, contenu);
        return emailEnvoye && smsEnvoye;
    }
} 