public class Monster {

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
        this.vida += stun;
        this.vida = Math.max(this.stun,0);
    }



    public void update() {stado.execute();}

    public void setStado(Stado stado){
        this.stado.leave();
        this.stado = stado;
        stado.enter();
    }


}
