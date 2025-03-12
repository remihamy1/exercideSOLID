# Principe de Ségrégation des Interfaces (ISP)

## Définition
Le principe de Ségrégation des Interfaces stipule qu'il est préférable d'avoir plusieurs interfaces spécifiques plutôt qu'une seule interface générale. En d'autres termes, aucun client ne devrait être forcé de dépendre de méthodes qu'il n'utilise pas.

## Cas Concret : Système de Gestion d'Imprimantes

Dans cet exercice, nous avons un système de gestion d'imprimantes qui permet de gérer différents types d'imprimantes avec différentes fonctionnalités (impression, numérisation, télécopie, etc.).

### Problème
Dans la version "avant", il existe une interface `Imprimante` qui définit toutes les fonctionnalités possibles pour tous les types d'imprimantes. Cela force les classes qui implémentent cette interface à fournir des implémentations pour des méthodes qu'elles ne peuvent pas réellement supporter (par exemple, une imprimante simple ne peut pas numériser ou télécopier), ce qui viole le principe de Ségrégation des Interfaces.

### Objectif du Refactoring
Refactoriser le code pour diviser l'interface `Imprimante` en plusieurs interfaces plus petites et plus spécifiques, de sorte que chaque classe n'implémente que les interfaces correspondant aux fonctionnalités qu'elle supporte réellement.

### Indices
1. Identifiez les différentes responsabilités dans l'interface `Imprimante`
2. Créez des interfaces séparées pour chaque responsabilité
3. Faites en sorte que chaque classe n'implémente que les interfaces dont elle a besoin

### Critères d'Évaluation
- Chaque classe ne doit implémenter que les interfaces correspondant aux fonctionnalités qu'elle supporte réellement
- Les classes ne doivent pas être forcées d'implémenter des méthodes qu'elles ne peuvent pas supporter
- Le code doit être plus modulaire et plus facile à étendre 