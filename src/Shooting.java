public class Shooting extends AbstractState<Soldado> {

    public Shooting(Soldado soldado) {
        super(soldado);
    }


    public void enter() {
        System.out.println("inimigo a vista FOGO");
        getPapeis().Shoot = true;
    }

    public void leave() {
        System.out.println("ACABOU AS BALAS");
    }


    public void execute() {
        getPapeis().subBala (-5);
        getPapeis().printStats("PEW PEW PEW");

        if(getPapeis().getBala() <= 0) {
            getPapeis().setStado(new Reloading(getPapeis()));
        }
    }
}