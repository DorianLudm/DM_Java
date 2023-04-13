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
        String res = "";
        return res;
    }
}