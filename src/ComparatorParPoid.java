import java.util.Comparator;

public class ComparatorParPoid implements Comparator<Animal>{

    @Override
    public int compare(Animal animal1, Animal animal2){
        return Integer.compare(animal2.getPoidAnimal(),animal1.getPoidAnimal());
    }
}

//Comparer par poid = comparator (return Integer.compare(otherAnimal.getPoidAnimal(),this.getPoidAnimal());)