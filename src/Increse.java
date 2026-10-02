public class Increse extends AbstractState {

    public Increse(Soldado soldado,Monster monster) {
        super(soldado, monster);}



    public void enter() {
        System.out.println("RAIO GIGANTIFICADOR");
    }

    public void leave() {
        System.out.println("TA NA HORA  DO PAU");
    }


    public void execute() {
        getMonster().big = true;
        printStats("(crecendo)");

        if(getMonster().big = true) {
            getMonster().setStado(new Heal(getSoldado(),getMonster()));
        }
    }
}