public abstract class AbstractState implements Stado {

    private Soldado soldado;
    private Monster Monster;
    public AbstractState(Soldado Soldado) {
        this.soldado = Soldado;
    }
    public AbstractState(Monster Monster) {
        this.Monster = Monster;
    }

    public Soldado getSoldado() {
        return soldado;
    }
    public Monster getMonster() {
        return Monster;
    }

    public void printStats(String stado) {
        System.out.println(stado);
        System.out.println("muniçao: " + soldado.getBala());
        System.out.println("vida: " + Monster.getVida());
        System.out.println("stun: " + Monster.getStun());
        System.out.println("GRANDE: " + Monster.getBig());

    }

    public void enter() {
    }

    public void leave() {
    }
}


