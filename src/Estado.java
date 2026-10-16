public interface Estado<C> {

    C getPapeis();

    void enter();
    void execute();
    void leave();
}