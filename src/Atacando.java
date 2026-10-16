public class Atacando extends AbstractState<Monster>  {

    public Atacando(Monster monster) {
        super(monster);
    }


    public void enter() {
        System.out.println("MORRA HUMANO");
    }

    public void leave() {
        System.out.println("AAAHHH");
    }


    public void execute() {

            getPapeis().addVida(-15);

        getPapeis().printStats("AHHH MEU OMBRO");

        if(getPapeis().getVida() <= 30 && !getPapeis().getBig()) {
            getPapeis().setStado(new Stunned(getPapeis()));
        } else if (getPapeis().getVida() <= 100 && getPapeis().getBig()) {
            getPapeis().setStado(new Heal(getPapeis()));
        }
    }
}