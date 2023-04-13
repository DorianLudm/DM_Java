public class Executable {
    public static void main(String[] args) {
        // Initialisation des Zoos
        Zoo beauval = new Zoo("Beauval");
        Zoo vincennes = new Zoo("Vincennes");

        //Initialisation des Enclos des Zoos
        Enclos savaneDesLions = new Enclos("La savane des Lions de Beauval", 1895);
        Enclos jungleDesSerpents = new Enclos("La jungle des serpents de Beauval", 120);
        Enclos vivarium = new Enclos("Vivarium", 95);
        Enclos enclosLions = new Enclos("Enclos des Lions", 645);

        //Ajout des enclos dans les zoos
        beauval.ajouterEnclos(savaneDesLions);
        beauval.ajouterEnclos(jungleDesSerpents);
        beauval.ajouterEnclos(vivarium);

        vincennes.ajouterEnclos(vivarium);
        vincennes.ajouterEnclos(enclosLions);

        //Création des animaux
        Lion frédérick = new Lion("Frédérick", 176, false, true);
        Lion natasha = new Lion("Natasha", 129, false, false);
        Lion palma = new Lion("Palma", 134, false, false);
        Lion jaques = new Lion ("Jaques", 143, true, true);

        Serpent timothé = new Serpent("Timothée", 4, false, true);
        Serpent evan = new Serpent("Evan", 7, false, false);
        Serpent bob = new Serpent("Bob Le Serpent", 3, true, false);
        Serpent benoit = new Serpent("Benoit", 1, true, true);
        Serpent jean = new Serpent("Jean", 3, false, false);

        //Ajout des animaux dans les enclos de Beauval
        try {
            savaneDesLions.ajouterHabitant(frédérick);
            savaneDesLions.ajouterHabitant(natasha);
            savaneDesLions.ajouterHabitant(palma);
            jungleDesSerpents.ajouterHabitant(timothé);
            jungleDesSerpents.ajouterHabitant(benoit);
            jungleDesSerpents.ajouterHabitant(jean);
            jungleDesSerpents.ajouterHabitant(bob);
        } catch (MauvaisTypeAnimalException e) {
            System.out.println("L'animal qui à été ajouté à l'enclos n'est pas du même type que les autres animaux de cet enclos!");
        }
        

        //Ajout des animaux dans les enclos de Vincennes
        try {
            enclosLions.ajouterHabitant(frédérick);
            enclosLions.ajouterHabitant(jaques);
        } catch (MauvaisTypeAnimalException e) {
            System.out.println("L'animal qui à été ajouté à l'enclos n'est pas du même type que les autres animaux de cet enclos!");
        }

        //Ajout des animaux dans le vivarium (deux enclos différent mais possédant les mêmes attributes et mêmes animaux pour le Zoo de Beauval ainsi que de Vincennes)
        try {
            vivarium.ajouterHabitant(evan);
            vivarium.ajouterHabitant(jean);
        } catch (MauvaisTypeAnimalException e) {
            System.out.println("L'animal qui à été ajouté à l'enclos n'est pas du même type que les autres animaux de cet enclos!");
        }
        //Fin de l'initialisation
        //Début des asserts
    }
}
