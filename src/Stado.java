public interface Stado {

    Soldado getSoldado();
    Monster getMonster();

    void printStats(String status);

    void enter();
    void execute();
    void leave();

    public static void main(String[] args) {
        Soldado soldado = new Soldado();
        Monster Monster = new Monster();
        while (true) {
            soldado.update();
            Monster.update();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}