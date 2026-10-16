public class Heal extends AbstractState<Monster> {

    public Heal(Monster monster) {
        super(monster);
    }


    public void enter() {
        System.out.println("magia de cura");
    }

    public void leave() {
        System.out.println("HAHAHAHAHHA");
    }


    public void execute() {
        getPapeis().addVida (50);
        getPapeis().printStats("(curando)");

        if(getPapeis().getVida() == 300) {
            getPapeis().setStado(new Atacado(getPapeis()));
        }
    }
}