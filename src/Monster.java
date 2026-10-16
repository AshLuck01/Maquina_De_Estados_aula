public class Monster implements Papeis {

    private int vida = 100;
    private int stun = 5;
    public boolean big = false;

    private Stado stado = new Atacando (this);

    public int getVida(){return vida;}
    public int getStun(){return stun;}
    public boolean getBig() {return big;}

    public void addVida(int vida){
        this.vida += vida;
        this.vida = Math.min(this.vida,300);
    }
    public void addStun(int stun){
        this.stun += stun;
        this.stun = Math.max(this.stun,0);
    }

    public void update() {stado.execute();}

    public void setStado(Stado stado){
        this.stado.leave();
        this.stado = stado;
        stado.enter();
    }


    public void printStats(String stado) {
        System.out.println("\n---- Monster ----");
        System.out.println(stado);
        System.out.println("vida " + getVida());
        System.out.println("stun " + getStun());
        System.out.println("Grande? " + getBig());

    }
}
