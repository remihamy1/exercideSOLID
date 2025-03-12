/**
 * Interface pour les appareils qui peuvent envoyer des fax.
 * Cette interface respecte le principe de Ségrégation des Interfaces
 * en ne définissant que les fonctionnalités liées à la télécopie.
 */
public interface Faxable {

    boolean faxer(String document, String destinataire);
} 