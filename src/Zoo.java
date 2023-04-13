import java.util.ArrayList;
import java.util.List;

public class Zoo{
    private String nom;
    private List<Enclos> listeEnclos;

    public Zoo(String nomZoo){
        this.nom = nomZoo;
        this.listeEnclos = new ArrayList<>();
    }

    public String getNomZoo(){
        return this.nom;
    }

    public void setNom(String newName){
        this.nom = newName;
    }

    public void ajouterEnclos(Enclos enclos){
        listeEnclos.add(enclos);
    }

    public void soinger(String nomAnimal) throws AnimalNonBlesseException, AnimalNotInZooException{
        boolean soignerHappened = false;
        for(Enclos enclosElem: listeEnclos){
            for(Animal animalElem: enclosElem.getHabitants()){
                if(animalElem.getNomAnimal() == nomAnimal){
                    if(animalElem.animalBlesse()){
                        animalElem.soigner();
                        soignerHappened = true;
                    }
                    else{
                        throw new AnimalNonBlesseException();
                    }
                }
            }
        }
        if(!soignerHappened){
            throw new AnimalNotInZooException();
        }
    }

    public List<Animal> listerLesAnimaux(String nomEnclos) throws EnclosVideException, EnclosNonTrouve{
        List<Animal> res = new ArrayList<>();
        boolean enclosFound = false;
        for(Enclos enclosElem: listeEnclos){
            if(enclosElem.getNomEnclos() == nomEnclos){
                enclosFound = true;
                if(enclosElem.getHabitants().size() > 0){
                    for(Animal animalElem: enclosElem.getHabitants()){
                        res.add(animalElem);
                    }
                }
                else{
                    throw new EnclosVideException();
                }
            }
        }
        if(!enclosFound){
            throw new EnclosNonTrouve();
        }
        return res;
    }

    @Override
    public String toString(){
        String res = "";
        return res;
    }
}

class AnimalNonBlesseException extends Exception{}
class AnimalNotInZooException extends Exception{}
class EnclosVideException extends Exception{}
class EnclosNonTrouve extends Exception{}