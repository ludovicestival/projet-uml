# Projet Jeu d'Aventure

## Informations Générales
**Promotion :** 3iL Promo 23 
**Groupe :** Groupe 1 
**Membres du groupe :**
- Adrien IMPINNA
- Mathias CROS
- Ludovic ESTIVAL
- Anthony ENJALBERT

## Introduction
Ce projet consiste à concevoir et développer un jeu intéractif.

## Cahier des Charges

Lien vers le cahier des charges : [cahier des charges](cahier-charges.md)

## Scénario du jeu

Lien vers le scénario : [scenario](scenario.md)

## Conception Détaillée

### Diagramme de cas d'utilisation
Le diagramme de cas d'utilisation est le premier diagramme que nous avons modélisé. Il permet de représenter
les interactions entre l'utilisateur (le **joueur**) et le système (le **jeu intéractif**).

#### Acteur principal
Le joueur est l'unique acteur du système. Il interagit avec le jeu pour effectuers des actions telles que configurer ou gérer une partie.

#### Cas d'utilisations
Le cas d'utilisation principal est la création d'une partie.
Après avoir créé une partie, le joueur à trois choix qui s'offrent à lui : 
- Paramétrer la partie
   Lors du paramétrage de la partie, deux choix s'offrent au joueur : 
   - Régler le son : cela signifie augmenter ou diminuer le volume du son de la partie.
   - Choisir la langue : le joueur pourra choisir la langue qu'auront les différents textes dans le jeu.
- Supprimer la partie
   Une fois une partie créée, le joueur pourra la supprimer si il le souhaite. 
- Charger la partie
   Une fois une partie créée, le joueur peut charger la partie pour la lancer par la suite.
   Si jamais le joueur lance le jeu et possède déjà une partie, il pourra également la charger, et reprendre sa progression
   là où il s'était arrêté la dernière fois (principe de sauvegarde automatique dans le jeu).


### Diagramme de séquence
x

### Diagramme d'états-transitions
x

### Diagramme d'activité
x

### Diagramme de classes
Un diagramme de classes a été élaboré pour structurer les entités principales :
- `Jeu` représente la fenêtre du jeu
- `Partie` représente une partie créée par le joueur
- `Contexte` représente le contexte du choix proposé au joueur. Il permet de décrire une scène de l'histoire. Ce contexte peut avoir zéro ou un plusieurs choix. Si un contexte n'a pas de choix, il représente alors une des fins du jeu.
- `Choix` représente un choix que le joueur peut effectuer. Un choix pointera toujours vers le contexte suivant, à savoir ce qu'il se passe suite à ce choix.

Nous avons choisis des agrégations pour relier `Contexte` à `Partie` car un contexte ne peut pas exister sans l'existence d'une partie.

Idem pour la relation entre `Partie` et `Jeu`.


## Implémentation
Un squelette Java a été développé. Ce squelette inclut :
- La classe Jeu, qui correspond au "menu" du jeu avec la possibilité d'effectuer diverses actions sur une partie.
- La classe Partie, qui va gérer le paramétrage et la gestion d'une partie.
- La classe Contexte, représentant un passage de l'histoire, et possédant plusieurs choix.
- La classe Choix, permettant d'énoncer un choix dans un contexte, et de définir le contexte suivant suite à ce choix.

## Bilan des Outils de Modélisation

### Outils Utilisés
- **Logiciel UML :** 
      - PlantUML pour certains diagrammes UML (cas d'utilisation, séquence et classes).
      - Draw.Io pour les autres diagrammes UML (état-transition et activité).
- **IDE Java :** Visual Studio Code pour le développement.

<!-- ### Difficultés Rencontrées
- xxx

### Solutions Apportées
- xxx -->

## Conclusion
Ce projet a permis d'approfondir nos compétences en modélisation. Les étapes suivantes consisteraient à enrichir le gameplay et ajouter de nouvelles fonctionnalités.

---
**Merci pour votre attention !**
