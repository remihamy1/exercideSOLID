# Principe de Substitution de Liskov (LSP)

## Définition
Le principe de Substitution de Liskov stipule que les objets d'une classe dérivée doivent pouvoir remplacer les objets d'une classe de base sans altérer le comportement du programme. En d'autres termes, si S est un sous-type de T, alors les objets de type T peuvent être remplacés par des objets de type S sans altérer les propriétés désirables du programme.

## Cas Concret : Système de Gestion de Formes Géométriques

Dans cet exercice, nous avons un système de gestion de formes géométriques qui permet de calculer les aires et les périmètres de différentes formes.

### Problème
Dans la version "avant", la classe `Rectangle` est étendue par la classe `Carre`, mais cette relation viole le principe de Substitution de Liskov. En effet, un carré a des contraintes supplémentaires par rapport à un rectangle (ses côtés doivent être égaux), ce qui fait que les objets de type `Carre` ne peuvent pas toujours remplacer les objets de type `Rectangle` sans altérer le comportement du programme.

### Objectif du Refactoring
Refactoriser le code pour respecter le principe de Substitution de Liskov, en s'assurant que les objets de type `Carre` peuvent remplacer les objets de type `Rectangle` sans altérer le comportement du programme.

### Indices
1. Réfléchissez à la relation entre un rectangle et un carré du point de vue de la programmation orientée objet
2. Considérez l'utilisation d'une interface ou d'une classe abstraite commune
3. Assurez-vous que les méthodes des classes dérivées respectent les contrats définis par les classes de base

### Critères d'Évaluation
- Les objets de type `Carre` doivent pouvoir remplacer les objets de type `Rectangle` sans altérer le comportement du programme
- Le code doit être plus robuste et moins susceptible aux erreurs
- Les tests doivent passer pour toutes les classes 