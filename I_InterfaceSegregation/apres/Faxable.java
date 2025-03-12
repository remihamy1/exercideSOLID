/**
 * Interface pour les appareils qui peuvent envoyer des fax.
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées à la télécopie.
 */
public interface Faxable {
    /**
     * Envoie un fax.
     * 
     * @param document Le document à faxer
     * @param destinataire Le numéro de fax du destinataire
     * @return true si l'envoi a réussi, false sinon
     */
    boolean faxer(String document, String destinataire);
} 