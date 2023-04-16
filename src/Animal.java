public class Animal implements Soigne, Comparable<Animal>{
    private String nom;
    private int poid;
    private boolean estBlesse;

    public Animal(String nomAnimal, int PoidAnimal, boolean estBlesse){
        this.nom = nomAnimal;
        this.poid = PoidAnimal;
        this.estBlesse = estBlesse;
    }

    public String getNomAnimal(){
        return this.nom;
    }

    public void setNomAnimal(String newNameAnimal){
        this.nom = newNameAnimal;
    }

    public int getPoidAnimal(){
        return this.poid;
    }

    public void setPoidAnimal(int newPoid){
        this.poid = newPoid;
    }

    public void variationPoidAnimal (int variationPoidAnimal) throws ResultatVariationPoidNegatif{
        if(this.poid + variationPoidAnimal < 0){
            throw new ResultatVariationPoidNegatif();
        }
        else{
            this.poid += variationPoidAnimal;
        }
    }

    public boolean animalBlesse(){
        return this.estBlesse;
    }

    public String getCri(){
        return "un cri!";
    }

    public String crier(){
        return this.getNomAnimal() + " fait " + getCri();
    }

    @Override
    public void soigner(){
        this.estBlesse = false;
    }

    @Override
    public String toString(){
        String blesse = "";
        if(this.estBlesse){
            blesse = "est blesse";
        }
        else{
            blesse = "n'est pas blesse";
        }
        return this.nom + ", " + blesse + " , pese " + this.getPoidAnimal() + "Kg ";
    }

    @Override
    public int compareTo(Animal otherAnimal){
        return this.getNomAnimal().compareTo(otherAnimal.getNomAnimal());
    }
}

class ResultatVariationPoidNegatif extends Exception{}