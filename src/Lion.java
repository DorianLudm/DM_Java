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
        String criniere = "";
        if(this.possedeCriniere()){
            criniere = "possede une criniere";
        }
        else{
            criniere = "n'a pas de criniere";
        }
        return super.toString() + "et " + criniere;
    }

    @Override
    public String getCri(){
        return "Roaarrrrr!";
    }

    @Override
    public String crier(){
        return super.crier();
    }
}
