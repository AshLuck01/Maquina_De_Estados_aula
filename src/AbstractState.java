public abstract class AbstractState implements Stado {

    private Soldado soldado;
    private Monster monster;

    public AbstractState(Soldado soldado, Monster monster) {
        this.soldado = soldado;
        this.monster = monster;
    }


    public Soldado getSoldado() {return soldado;}
    public Monster getMonster() {return monster;}


    public void printStats(String stado ) {
        System.out.println(stado);


        if (soldado != null) {
            System.out.println("muniçao: " + soldado.getBala());
        }
        if (monster != null) {
            System.out.println("vida: " + monster.getVida());
            System.out.println("stun: " + monster.getStun());
            System.out.println("GRANDE: " + monster.getBig());
        }
    }

    public void enter() {
    }

    public void leave() {
    }
}


