public class Heal extends AbstractState {

    public Heal(Soldado soldado,Monster monster) {
        super(soldado, monster);}


    public void enter() {
        System.out.println("magia de cura");
    }

    public void leave() {
        System.out.println("HAHAHAHAHHA");
    }


    public void execute() {
        getMonster().addVida (10);
        printStats("(curando)");

        if(getMonster().getVida() == 300) {
            getMonster().setStado(new Atacando(getSoldado(),getMonster()));
        }
    }
}