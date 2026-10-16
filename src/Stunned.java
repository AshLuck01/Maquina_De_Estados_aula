public class Stunned extends AbstractState<Monster> {

    public Stunned(Monster monster) {
        super(monster);
    }


    public void enter() {
        System.out.println("monstro com estrelinhas girando envolta da cabeça");
    }

    public void leave() {
        System.out.println("tecnica secreta");
    }


    public void execute() {
        getPapeis().addVida (-5);
        getPapeis().addStun (-1);
        getPapeis().printStats("estrelas girando");

        if(getPapeis().getStun() == 0) {
            getPapeis().setStado(new Increse(getPapeis()));
        }
    }
}