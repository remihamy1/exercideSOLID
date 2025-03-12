/**
 * Classe ServiceEmail qui a la responsabilité unique d'envoyer des emails.
 */
public class ServiceEmail {
    
    /**
     * Envoie un email à un employé.
     * 
     * @param employe L'employé à qui envoyer l'email
     * @param sujet Le sujet de l'email
     * @param contenu Le contenu de l'email
     * @return true si l'email a été envoyé avec succès, false sinon
     */
    public boolean envoyerEmail(Employe employe, String sujet, String contenu) {
        String email = employe.getEmail();
        
        try {
            System.out.println("Envoi d'un email à " + email);
            System.out.println("Sujet: " + sujet);
            System.out.println("Contenu: " + contenu);
            
            // Code pour se connecter au serveur SMTP et envoyer l'email
            // (simulé ici pour simplifier)
            System.out.println("Email envoyé avec succès à " + email);
            
            return true;
        } catch (Exception e) {
            System.err.println("Erreur lors de l'envoi de l'email à " + email + ": " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Envoie un email à plusieurs employés.
     * 
     * @param employes Les employés à qui envoyer l'email
     * @param sujet Le sujet de l'email
     * @param contenu Le contenu de l'email
     * @return Le nombre d'emails envoyés avec succès
     */
    public int envoyerEmailMasse(Employe[] employes, String sujet, String contenu) {
        int compteur = 0;
        for (Employe employe : employes) {
            if (envoyerEmail(employe, sujet, contenu)) {
                compteur++;
            }
        }
        return compteur;
    }
} 