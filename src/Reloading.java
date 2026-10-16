public class Reloading extends AbstractState<Soldado> {

    public Reloading(Soldado soldado) {
        super(soldado);
    }


    public void enter() {
        System.out.println("RECARREGANDO");
        getPapeis().Shoot = false;
    }

    public void leave() {
        System.out.println("FOGO");
    }

    public void execute() {
        getPapeis().subBala(10);
        getPapeis().printStats("Ching, Ching ");

        if(getPapeis().getBala() >= 50) {
            getPapeis().setStado(new Shooting(getPapeis()));
        }
    }
}