import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Création des services de notification
        ServiceNotification emailService = new EmailService();
        ServiceNotification smsService = new SMSService();
        ServiceNotification notificationPushService = new NotificationPushService();
        
        // Création du gestionnaire de notification avec les services
        GestionnaireNotification gestionnaireNotification = new GestionnaireNotification(
            Arrays.asList(emailService, smsService, notificationPushService)
        );
        
        // Envoi d'une notification via tous les services
        System.out.println("=== Notification via tous les services ===");
        gestionnaireNotification.notifierTous("utilisateur@example.com", "Ceci est une notification importante.");
        
        // Envoi d'une notification via un service spécifique (email)
        System.out.println("\n=== Notification via le service d'email ===");
        gestionnaireNotification.notifier(0, "utilisateur@example.com", "Ceci est une notification par email.");
        
        // Envoi d'une notification via un service spécifique (SMS)
        System.out.println("\n=== Notification via le service de SMS ===");
        gestionnaireNotification.notifier(1, "0123456789", "Ceci est une notification par SMS.");
        
        // Envoi d'une notification via un service spécifique (notification push)
        System.out.println("\n=== Notification via le service de notification push ===");
        gestionnaireNotification.notifier(2, "device-123", "Ceci est une notification push.");
        
        // Création d'un nouveau gestionnaire de notification sans services
        GestionnaireNotification autreGestionnaire = new GestionnaireNotification();
        
        // Ajout d'un service de notification
        autreGestionnaire.ajouterServiceNotification(emailService);
        
        // Envoi d'une notification via le service ajouté
        System.out.println("\n=== Notification via le service ajouté ===");
        autreGestionnaire.notifierTous("autre-utilisateur@example.com", "Ceci est une autre notification.");
        
        // Avantages de cette approche :
        // 1. Le GestionnaireNotification ne dépend pas des classes concrètes, mais de l'interface ServiceNotification
        // 2. On peut facilement ajouter de nouveaux types de services de notification sans modifier le GestionnaireNotification
        // 3. On peut facilement tester le GestionnaireNotification en utilisant des mocks ou des stubs
    }
} 