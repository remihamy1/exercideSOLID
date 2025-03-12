# Test-Driven Development (TDD)

Ce dossier contient des exemples illustrant le Test-Driven Development (TDD), une approche de développement logiciel où les tests sont écrits avant le code de production.

## Principes du TDD

Le TDD suit un cycle en trois étapes, souvent appelé "Red-Green-Refactor" :

1. **Red** : Écrire un test qui échoue pour la fonctionnalité à implémenter
2. **Green** : Écrire le code minimal pour faire passer le test
3. **Refactor** : Améliorer le code sans changer son comportement

## Structure du projet

Ce projet contient plusieurs exemples de TDD :

- `calculateur` : Un exemple simple d'une calculatrice avec des opérations de base
- `gestionnaire-taches` : Un gestionnaire de tâches plus complexe avec des fonctionnalités CRUD

## Avantages du TDD

- Conception orientée vers l'utilisation (API-first)
- Documentation vivante du comportement attendu
- Confiance lors des refactorisations
- Couverture de test élevée
- Feedback rapide sur les régressions

## Comment exécuter les tests

Pour exécuter les tests, utilisez la commande suivante :

```bash
javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar *.java
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore NomDuTestRunner
```

Ou avec Maven :

```bash
mvn test
``` 