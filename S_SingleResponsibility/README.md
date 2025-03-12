# Principe de Responsabilité Unique (SRP)

## Définition
Le principe de Responsabilité Unique stipule qu'une classe ne doit avoir qu'une seule raison de changer, c'est-à-dire qu'elle ne doit avoir qu'une seule responsabilité.

## Cas Concret : Système de Gestion d'Employés

Dans cet exercice, nous avons un système de gestion d'employés qui permet de :
- Gérer les informations des employés (nom, salaire, etc.)
- Calculer les salaires
- Sauvegarder les données des employés dans un fichier
- Générer des rapports sur les employés

### Problème
Dans la version "avant", la classe `Employe` fait tout : elle stocke les données, calcule le salaire, sauvegarde les données et génère des rapports. Cela viole le principe de Responsabilité Unique car la classe a plusieurs raisons de changer.

### Objectif du Refactoring
Refactoriser le code pour que chaque classe n'ait qu'une seule responsabilité :
- Une classe pour représenter un employé et ses données
- Une classe pour calculer les salaires
- Une classe pour sauvegarder les données
- Une classe pour générer des rapports

### Indices
1. Identifiez les différentes responsabilités dans la classe `Employe`
2. Créez des classes séparées pour chaque responsabilité
3. Utilisez la composition pour que ces classes puissent travailler ensemble

### Critères d'Évaluation
- Chaque classe ne doit avoir qu'une seule responsabilité
- Le comportement global du système doit rester le même
- Le code doit être plus facile à maintenir et à étendre 