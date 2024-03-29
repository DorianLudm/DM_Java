public class Serpent extends Animal{
    private boolean venimeux;

    public Serpent(String nomAnimal, int PoidAnimal, boolean estBlesse, boolean estVenimeux){
        super(nomAnimal, PoidAnimal, estBlesse);
        this.venimeux = estVenimeux;
    }

    public boolean estVenimeux(){
        return this.venimeux;
    }

    @Override
    public void soigner(){
        super.soigner();
    }

    @Override
    public String toString(){
        String venimeux = "";
        if(this.estVenimeux()){
            venimeux = "est venimeux";
        }
        else{
            venimeux = "n'est pas venimeux";
        }
        return super.toString() + "et " + venimeux;
    }

    @Override
    public String getCri(){
        return "Tttssssss!";
    }

    @Override
    public String crier(){
        return super.crier();
    }
}