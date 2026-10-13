# SOLID
« S » correspond au principe single responsibility (responsabilité unique).
Une classe ne doit faire qu'une seule chose et elle doit bien la faire. Elle ne doit avoir qu'une seule raison de changer.

« O » correspond au principe open/closed (ouvert/fermé).
Une classe doit être ouverte à l'extension, mais fermée à la modification.

« L » correspond au principe de substitution de Liskov.
L'ajout d'un sous-type par héritage ne doit pas rompre le code existant. C'est ce que j'appelle le principe « zéro surprise ». En d'autres termes, si le système fonctionne et que j'ajoute une nouvelle classe héritée d'une autre, le système doit continuer de fonctionner.

« I » correspond au principe interface segregation (ségrégation des interfaces).
Il s'agit pour l'essentiel du principe de responsabilité unique appliqué aux interfaces.

« D » correspond au principe dependency inversion (inversion des dépendances).
Les classes de haut niveau ne devraient pas avoir à être modifiées lorsqu'une classe de bas niveau est modifiée. Les classes de haut niveau doivent définir une abstraction à laquelle se conforme la classe de bas niveau.

# MVC
Modèle : le modèle contient les informations (données) utilisées par le système.

Vue : la vue est la façon dont ces informations sont affichées pour l’utilisateur.

Contrôleur : le contrôleur veille à ce que les demandes de l'utilisateur soient correctement exécutées, en modifiant les objets du modèle et en mettant à jour la vue.