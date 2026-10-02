public class Atacando extends AbstractState {

    public Atacando(Soldado soldado,Monster monster) {
        super(soldado, monster);}



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
            getMonster().setStado(new Stunned(getSoldado(),getMonster()));
        } else if (getMonster().getVida() <= 100 && getMonster().getBig()) {

            getMonster().setStado(new Heal(getSoldado(), getMonster()));
        }
    }
}