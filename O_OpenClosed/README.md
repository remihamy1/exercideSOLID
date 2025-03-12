# Principe Ouvert/Fermé (OCP)

## Définition
Le principe Ouvert/Fermé stipule que les entités logicielles (classes, modules, fonctions, etc.) doivent être ouvertes à l'extension, mais fermées à la modification. Cela signifie qu'on devrait pouvoir étendre le comportement d'une entité sans modifier son code source.

## Cas Concret : Système de Calcul de Taxes

Dans cet exercice, nous avons un système de calcul de taxes pour différents types de produits.

### Problème
Dans la version "avant", la classe `CalculateurTaxes` contient une méthode qui utilise des conditions (if/else) pour calculer les taxes en fonction du type de produit. Chaque fois qu'un nouveau type de produit est ajouté, il faut modifier la classe `CalculateurTaxes`, ce qui viole le principe Ouvert/Fermé.

### Objectif du Refactoring
Refactoriser le code pour que l'ajout d'un nouveau type de produit ne nécessite pas de modifier la classe `CalculateurTaxes`. La classe doit être fermée à la modification mais ouverte à l'extension.

### Indices
1. Utilisez le polymorphisme pour permettre à chaque type de produit de définir son propre calcul de taxe
2. Créez une interface ou une classe abstraite pour les produits
3. Implémentez cette interface pour chaque type de produit

### Critères d'Évaluation
- La classe `CalculateurTaxes` ne doit pas contenir de conditions basées sur le type de produit
- L'ajout d'un nouveau type de produit ne doit pas nécessiter de modifier la classe `CalculateurTaxes`
- Le comportement global du système doit rester le même 