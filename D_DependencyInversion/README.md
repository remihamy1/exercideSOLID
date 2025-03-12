# Principe d'Inversion des Dépendances (DIP)

## Définition
Le principe d'Inversion des Dépendances stipule que :
1. Les modules de haut niveau ne devraient pas dépendre des modules de bas niveau. Les deux devraient dépendre d'abstractions.
2. Les abstractions ne devraient pas dépendre des détails. Les détails devraient dépendre des abstractions.

En d'autres termes, le code doit dépendre d'abstractions (interfaces ou classes abstraites) plutôt que de classes concrètes.

## Cas Concret : Système de Notification

Dans cet exercice, nous avons un système de notification qui permet d'envoyer des notifications aux utilisateurs via différents canaux (email, SMS, notification push, etc.).

### Problème
Dans la version "avant", la classe `ServiceNotification` dépend directement des classes concrètes `EmailService` et `SMSService`. Cela rend le code difficile à étendre et à tester, car il est étroitement couplé à ces implémentations spécifiques.

### Objectif du Refactoring
Refactoriser le code pour appliquer le principe d'Inversion des Dépendances, en faisant en sorte que la classe `ServiceNotification` dépende d'une abstraction (interface) plutôt que des classes concrètes.

### Indices
1. Créez une interface pour représenter un service de notification
2. Faites en sorte que les classes concrètes implémentent cette interface
3. Modifiez la classe `ServiceNotification` pour qu'elle dépende de l'interface plutôt que des classes concrètes

### Critères d'Évaluation
- La classe `ServiceNotification` ne doit pas dépendre directement des classes concrètes
- Il doit être facile d'ajouter de nouveaux types de services de notification sans modifier la classe `ServiceNotification`
- Le code doit être plus facile à tester grâce à l'utilisation d'abstractions 