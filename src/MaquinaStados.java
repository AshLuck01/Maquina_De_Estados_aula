import java.util.ArrayList;

public class MaquinaStados {
    private ArrayList<Papeis> papeis = new ArrayList<>();

    public void run() {
        papeis.add(new Soldado());
        papeis.add(new Monster());

        while (true) {
            for(Papeis c : papeis){
                c.update();
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public static void main(String[] args) {
        new MaquinaStados().run();
    }
}
