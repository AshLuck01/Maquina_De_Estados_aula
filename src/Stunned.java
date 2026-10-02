public class Stunned extends AbstractState {

    public Stunned(Soldado soldado, Monster monster) {
        super(soldado, monster);
    }


    public void enter() {
        System.out.println("monstro com estrelinhas girando envolta da cabeça");
    }

    public void leave() {
        System.out.println("tecnica secreta");
    }


    public void execute() {
        getMonster().addVida (-5);
        getMonster().addStun (-1);
        printStats("estrelas girando");

        if(getMonster().getStun() == 0) {
            getMonster().setStado(new Increse(getSoldado(),getMonster()));
        }
    }
}