Pour ce laboratoire, nous développons une modélisation des files d’attente pour un
supermarché ayant des files rapides ainsi que des files normales (régulières). Les files
d’attente seront modélisées à l’aide de files (objets réalisant l’interface Queue).
Il y a donc une interface, nommée Queue, ainsi qu’une implémentation simple, nommée,
ArrayQueue qui vous sont fournies ci-joint.
Pour l’écriture des programmes, il faut faire certaines suppositions.
• Il s’agit d’une modélisation où le temps a été discrétisé. Ainsi, une modélisation est
constituée d’un nombre fixe et prédéterminé de périodes. Au début, la valeur de l’horloge
est mise à 0, par la suite, pour chaque itération la valeur de temps est augmentée d’une
quantité fixe (ITER) ;
• Pour chaque itération, un ou plusieurs des événements suivants peuvent survenir :
– Un nouveau client joint la file. La probabilité de l’arrivée d’un nouveau client est
PROBABILITY_NEW_CLIENT. Le nombre de produits achetés suit une distribution
uniforme dont l’intervalle est 1 . . .MAX_TEMS;
– Un caissier traite exactement un item par itération (sauf si sa file est vide).
