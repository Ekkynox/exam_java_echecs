Exectueur
- La signature de la classe main() n'était pas bonne : elle doit être static et avoir ne paramètre un tableau de String.
- À l'intérieur de main, lancer doit être appelé via l'instance de Game appelée g et non via la classe Game directement.

Position
- Passage des méthodes inBounds() et clone() en public.
- Simplification du return dans inBounds(), clone(), equals() et getPosition().

Roi
- getRoiCouleur(), update() passées en public.

Game
- Appels à echec, echecEtMat, echecEtPat et couleur remplacés par des getters.

Piece
- Passage de la classe en abstract.
- Suppression du constructeur Piece(int x, int y, Couleur c, boolean b) car inutilisé.

Fou
- Suppression du constructeur Fou(int x, int y, Couleur c, boolean b) car inutilisé.

Tour
- Suppression du constructeur Tour(int x, int y, Couleur c, boolean b) car inutilisé.

Echiquier
- Appel à position remplacé par un getter.
- Dans l'affichage, rectification des noms des pièces en français dans le switch.

Joueur
- Dans updateTab(), inversion des couleurs ennemies.
- Suppression de abandonner() car méthode vide et inutilisée.

Général
- Réindentation du code dans plusieurs fichiers.
- Passage de toutes les propriétés de classe en private, création des getters si nécessaires.

Pour la liste des joueurs :
Il a été décidé que si un joueur n'entre pas de nom, alors il aura le nom par défaut de sa couleur.
Dans le cas où on évoluerait la liste des joueurs en classement par nombre de victoire, il a été décidé de ne pas enregistré un joueur nommé par défaut dans la liste globale des joueurs, pour éviter
que "Joueur blanc" ou "Joueur noir" ne se retrouvent sur le classement avec toutes les victoires d'anonymes.