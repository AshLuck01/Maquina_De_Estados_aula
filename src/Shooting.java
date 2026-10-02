public class Shooting extends AbstractState {

    public Shooting(Soldado Soldado,Monster monster) {
        super(Soldado, monster);
    }


    public void enter() {
        System.out.println("inimigo a vista FOGO");
        getSoldado().Shoot = true;
    }

    public void leave() {
        System.out.println("ACABOU AS BALAS");
    }


    public void execute() {
        getSoldado().subBala (-5);

        printStats("PEW PEW PEW");

        if(getSoldado().getBala() <= 0) {
            getSoldado().setStado(new Reloading(getSoldado()));
        }
    }
}