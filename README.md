# Les Sorciers.

TD **Les sorciers**, réalisé pendant le BOOTCAMP. Ce répertoire contient aussi les éléments du td **Les magiciens**, qui ne sont cependant pas utilisés dans le main.

## Les interfaces.
Deux interfaces ont été utilisées.
### Victime.
Cette interface est commune aux **personnages**, et aux **nains de jardins**. Les victimes devront implémenter les méthodes **subirFrappe** et **subirCharme**.
### SuperPouvoir.
Cette interface est utilisée uniquement par les **magiciens**, qui descendent des **sorciers**.
## Les classes.
### Personnage.
Cette classe englobe tous les personnages du jeux. Les paramètres attendus sont :
* Un nom.
* Une quantité de points de vie.
* Le statut (mort ou vivant).

### Sorcier.
Cette classe hérite de Personnage. Les Sorciers peuvent **charmer** les monstres, mais ne peuvent pas se charmer entre eux: **ils jouent donc ensemble**
### Monstre.
Cette classe hérite de Personnage. Les Monstres peuvent **frapper** les sorciers, et les autres monstres : **les monstres jouent en solo**.
### Les magiciens.
Classe de l'extension **Les magiciens**, ils héritent des sorciers et implementent l'interface SuperPouvoir. Spécificité : quand ils se font charmer par un sorcier, ils contre-attaquent grâce à leurs super pouvoir. **Les magiciens jouent en solo**.
### Les nains de jardins.
Les nains de jardins ne sont pas des personnages : ils implementent l'interface **victime**. L'unique paramètre attendu est la solidité : celle-ci définit le comportement du nain de jardin quand il se fait frapper par un monstre. Le nain de jardin n'est pas sensible à la magie, et ne subit pas les charmes.
*Les nains de jardins ne peuvent gagner : on peut les voir comme des NPC (personnages non joueurs) troubles-fêtes.*
### Les gnomes de jardins.
Les gnomes de jardins sont semblables aux nains de jardins, dont ils héritent. Il possèdent le même comportement, sauf lorsqu'ils sont la cible d'un charme : ils ont alors une chance d'envoyer un contre sort.
## L'exécution.
### La mise en place.
La partie proposée dans la classe Main est celle décrite dans le TD *Les_sorciers*. Il y a 10 personnages sur le plateau : 5 monstres, et 5 sorciers. Les points de vies des peronnages sont attribués aléatoirement, et prennent des valeurs comprises entre 0 et 100.
### Le déroulement.
A chaque tours, un joueur A attaque un joueur B : les deux joueurs sont choisis aléatoirement. Pour chaque tour, un message s'affiche, indiquant l'action réalisée.
### La fin de partie.
Conformément aux règles d'équipe établies, il y a deux fins possibles :
* les sorciers gagnent.
* un monstre gagne.
A la fin de la partie, un message s'affiche, indiquant le vainqueur.
