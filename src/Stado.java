public interface Stado<C> {

    C getPapeis();

    void enter();
    void execute();
    void leave();
}