Dans ce package je vous présente un héritage impliquant également des interfaces.
D'une part vous avez une hiérarchie de classes qui débute par la classe Animal
avec 2 branches principales (classes filles): Mammifere et Oiseau.
D'autres part vous avez des comportements alimentaires qui sont proposés sous forme d'interfaces.
Exemple:
- Le lion hérite de mammifère et implémente carnivore   ==> Le lion est à la fois un mammifère et un carnivore
- Le koala hérite de mammifère et implémente herbivore  ==> le koala est à la fois un mammifère et un herbivore
- L'aigle hérite de oiseau et implémente carnivore      ==> L'aigle est à la fois un mammifère et un carnivore

Si vous analysez la classe TestAnimal vous verrez des méthodes qui s'appliquent à différents types d'objets.
Par exemple la méthode traiterMammifere :
- va pouvoir prendre en paramètre une instance de Lion ou de Koala
- mais pas une instance d'Aigle car l'aigle n'est pas un mammifère

la méthode traiterCarnivore :
- va pouvoir prendre en paramètre une instance de Lion ou d'Aigle
- mais pas une instance de Koala car le koala n'est pas un carnivore