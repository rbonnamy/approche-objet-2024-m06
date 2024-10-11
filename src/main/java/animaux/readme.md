Dans ce package je vous présente une hiérarchie impliquant des classes et des interfaces.    
D'une part vous avez une hiérarchie de classes qui débute par la classe **Animal**
avec 2 classes filles: **Mammifere** et **Oiseau**. Chacune de ces classes filles a également des
classes filles.  
  
D'autre part vous avez des comportements alimentaires qui sont proposés sous forme d'interfaces.
Exemple:
- La classe Lion hérite de **Mammifere** et implémente **Carnivore**
- La classe Koala hérite de **Mammifere** et implémente **Herbivore**
- La classe Aigle hérite de **Oiseau** et implémente **Carnivore**

Si vous analysez la classe **TestAnimal** vous verrez des méthodes qui s'appliquent à différents types d'objets.
Par exemple la méthode **traiterMammifere** :
- va pouvoir prendre en paramètre une instance de Lion ou de Koala
- mais pas une instance d'Aigle car l'aigle n'est pas un mammifère

la méthode **traiterCarnivore** :
- va pouvoir prendre en paramètre une instance de Lion ou d'Aigle
- mais pas une instance de Koala car le koala n'est pas un carnivore