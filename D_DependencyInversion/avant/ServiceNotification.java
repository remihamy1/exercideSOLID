/**
 * Classe qui gère l'envoi de notifications aux utilisateurs.
 * Cette classe viole le principe d'Inversion des Dépendances car elle dépend
 * directement des classes concrètes EmailService et SMSService.
 */
public class ServiceNotification {
    private EmailService emailService;
    private SMSService smsService;
    private PusNotif
    
    /**
     * Constructeur qui initialise les services de notification.
     */
    public ServiceNotification() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public boolean notifierParEmail(String destinataire, String sujet, String contenu) {
        return emailService.envoyerEmail(destinataire, sujet, contenu);
    }

    public boolean notifierParSMS(String numeroTelephone, String message) {
        return smsService.envoyerSMS(numeroTelephone, message);
    }
    

    public boolean notifierParEmailEtSMS(String emailDestinataire, String numeroTelephone, String sujet, String contenu) {
        boolean emailEnvoye = emailService.envoyerEmail(emailDestinataire, sujet, contenu);
        boolean smsEnvoye = smsService.envoyerSMS(numeroTelephone, contenu);
        return emailEnvoye && smsEnvoye;
    }
} 