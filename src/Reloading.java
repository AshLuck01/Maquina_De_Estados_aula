public class Reloading extends AbstractState {

    public Reloading(Soldado soldado) {
        super(soldado);
    }


    public void enter() {
        System.out.println("RECARREGANDO");
        getSoldado().Shoot = false;
    }

    public void leave() {
        System.out.println("FOGO");
    }

    public void execute() {
        getSoldado().subBala(10);
        printStats("Ching, Ching ");

        if(getSoldado().getBala() >= 50) {
            getSoldado().setStado(new Shooting(getSoldado()));
        }
    }
}