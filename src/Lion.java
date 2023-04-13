public class Lion extends Animal{
    private boolean criniere;

    public Lion(String nomAnimal, int PoidAnimal, boolean estBlesse, boolean possedeCriniere){
        super(nomAnimal, PoidAnimal, estBlesse);
        this.criniere = possedeCriniere;
    }

    public boolean possedeCriniere(){
        return this.criniere;
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
