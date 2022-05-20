package AnimalKT;

import AnimalKT.Animal;

public class Zoo {
    Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public int countAnimals() {
        return animals.length;
    }
}