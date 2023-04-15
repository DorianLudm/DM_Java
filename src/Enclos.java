import java.util.ArrayList;
import java.util.List;

public class Enclos{
    private String nom;
    private int surface;
    private List<Animal> habitants;

    public Enclos(String nomDeLenclos, int surface){
        this.nom = nomDeLenclos;
        this.surface = surface;
        this.habitants = new ArrayList<>();
    }

    public String getNomEnclos(){
        return this.nom;
    }

    public int getSurfaceEnclos(){
        return this.surface;
    }

    public void ajouterHabitant(Animal animal) throws MauvaisTypeAnimalException{
        if(habitants.size() > 0){
            if(animal.getClass() == habitants.get(0).getClass()){
                habitants.add(animal);
            }
            else{
                throw new MauvaisTypeAnimalException();
            }
        }
        else{
            habitants.add(animal);
        }
    }
    
    public List<Animal> getHabitants(){
        return this.habitants;
    }

    @Override
    public String toString(){
        return (this.getNomEnclos() +" (" + this.getSurfaceEnclos() + " m2) ");
    }
}

class MauvaisTypeAnimalException extends Exception{}