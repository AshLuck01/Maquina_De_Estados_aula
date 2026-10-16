public class Monster implements Papeis {

    private int vida = 100;
    private int stun = 5;
    public boolean big = false;

    private Estado estado = new Atacado (this);

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

    public void update() {estado.execute();}

    public void setStado(Estado stado){
        this.estado.leave();
        this.estado = estado;
        stado.enter();
    }


    public void printStats(String stado) {
        System.out.println("\n---- Monster ----");
        System.out.println(estado);
        System.out.println("vida " + getVida());
        System.out.println("stun " + getStun());
        System.out.println("Grande? " + getBig());

    }
}
