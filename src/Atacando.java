public class Atacando extends AbstractState {

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
        if (getSoldado().getShoot()) {
            getMonster().addVida(-15);
            printStats("AAAAHH MEU OMBRO");
        }
        if(getMonster().getVida() <= 30 && !getMonster().getBig()) {
            getMonster().setStado(new Stunned(getMonster()));
        } else if (getMonster().getVida() <= 100 && getMonster().getBig()) {
            getMonster().setStado(new Heal(getMonster()));
        }
    }
}