/**
 * Classe principale qui démontre l'utilisation du service de notification.
 */
public class Main {
    public static void main(String[] args) {
        // Création du service de notification
        ServiceNotification serviceNotification = new ServiceNotification();
        
        // Envoi d'une notification par email
        System.out.println("=== Notification par Email ===");
        serviceNotification.notifierParEmail("utilisateur@example.com", "Notification importante", "Ceci est une notification importante.");
        
        // Envoi d'une notification par SMS
        System.out.println("\n=== Notification par SMS ===");
        serviceNotification.notifierParSMS("0123456789", "Ceci est une notification importante.");
        
        // Envoi d'une notification par email et par SMS
        System.out.println("\n=== Notification par Email et SMS ===");
        serviceNotification.notifierParEmailEtSMS("utilisateur@example.com", "0123456789", "Notification très importante", "Ceci est une notification très importante.");
        
        // Problème : si on veut ajouter un nouveau type de notification (par exemple, une notification push),
        // il faut modifier la classe ServiceNotification, ce qui viole le principe Ouvert/Fermé.
        // De plus, la classe ServiceNotification est étroitement couplée aux classes EmailService et SMSService,
        // ce qui la rend difficile à tester et à étendre.
    }
} 