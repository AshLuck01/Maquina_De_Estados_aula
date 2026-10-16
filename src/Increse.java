public class Increse extends AbstractState<Monster> {

    public Increse(Monster monster) {
        super(monster);
    }


    public void enter() {
        System.out.println("RAIO GIGANTIFICADOR");
    }

    public void leave() {
        System.out.println("TA NA HORA  DO PAU");
    }


    public void execute() {
        getPapeis().big = true;
        getPapeis().printStats("(crecendo)");

        if(getPapeis().big = true) {
            getPapeis().setStado(new Heal(getPapeis()));
        }
    }
}