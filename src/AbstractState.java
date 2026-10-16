public abstract class AbstractState<C> implements Stado<C> {
    private final C papeis;
    public AbstractState(C papeis) {this.papeis = papeis;}

    public  C getPapeis() {return papeis;}

    public void enter() {
    }

    public void leave() {
    }
}


