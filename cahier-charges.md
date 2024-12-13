# Cahier des charges

## Projet : jeu vidéo narratif Cyberpunk

## Table des matières
1. [Contexte](#contexte)
2. [Fonctionnalités](#fonctionnalités)
3. [Contraintes techniques](#contraintes-et-ressources)
4. [Livrables](#livrables)

## Contexte

Ce projet a pour but de créer un jeu vidéo narratif basé dans un univers Cyberpunk, un genre dystopique de science-fiction qui se déroule dans un futur proche.
Etant un jeu narratif, son élément le plus important est son histoire et les choix qu'elle propose. Elle doit être riche et proposer des personnages et un scénario intéressants.
L'idéal étant que l'histoire fasse réfléchir les joueurs sur les thématiques du cyberpunk (inégalités, déshumanisation, pollution ou encore la surpopulation).

Le public visé par ce jeu est les joueurs de plus de 18 ans sur PC. Il est à destination des joueurs aimant plus les histoires immersives que les belles interfaces et les graphismes avancés. Il est aussi pour les joueurs aimant la science-fiction et les mondes dystopiques.

L'existant :
- le squelette du jeu codé en Java
- différents schémas UML qui détaillent le fonctionnement du jeu
- le scénario du jeu

Critères d'acceptabilité :
- le jeu doit fonctionner correctement, chaque chemin possible pour les choix de l'histoire sera testé

## Fonctionnalités

### Besoins fonctionnels

|Fonctionnalité |Priorité (de 1 à 5) |
|- |- |
| Créer une partie | 1 |
| Paraméter une partie (langue et volume des sons) | 1 |
| Lancer une partie | 1 |
| Faire des choix pour faire progresser l'histoire | 1 |
| Sauvegarder et quitter une partie | 1 |
| Charger une partie existante | 1 |
| Supprimer une partie | 1 |

La fin que le joueur obtiendra va dépendre de ses choix tout au long du jeu. Ainsi, le joueur peut obtenir une:
- Good Ending, la bonne[^1] fin du jeu
- Bad Ending, la mauvaise fin du scénario
- Dead End, un fin où le personnage meurt suite à un choix stupide

### Besoins non fonctionnels

|Besoin |Priorieté (de 1 à 5) |
|- |- |
| Le jeu doit être codé en Java | 1 |
| Le jeu doit fonctionner sur Windows  | 1 |
| Le jeu doit fonctionner sur macOS et Linux | 5 |


[^1]: Techniquement, les histoires Cyberpunk se finissent toujours mal. En parlant de bonne fin, on parle ici d'une fin moins pire que la *Bad Ending* ou la *Dead End*

## Contraintes et ressources

- budget : *à déterminer*
- temps alloué : *à déterminer*

## Livrables

Les livrables attendus sont :
- une version fonctionnelle du jeu prête au déploiement sur des plateformes de jeux
- une documentation technique
