public class Monster {
    private int vida = 100;
    private int stun = 5;
    public boolean big = false;

    private Stado stado;



    public int getVida(){return vida;}
    public int getStun(){return stun;}
    public boolean getBig() {return big;}

    public void iniciarMonstro(Soldado soldado) {
        this.stado = new Atacando(soldado, this);
        this.stado.enter();
    }

    public void addVida(int vida){
        this.vida += vida;
        this.vida = Math.max(this.vida,0);
    }
    public void addStun(int stun){
        this.vida += stun;
        this.stun = Math.max(this.stun,0);
    }



    public void update() {
        // Só executa se o estado já tiver sido inicializado
        if (stado != null) {
            stado.execute();
        }
    }

    public void setStado(Stado stado){
        if (this.stado != null) {
            this.stado.leave();
        }
        this.stado = stado;
        this.stado.enter();
    }


}
