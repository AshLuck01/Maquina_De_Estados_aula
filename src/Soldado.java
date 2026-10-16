public class Soldado implements Papeis  {
    private int bala = 50;
    public   boolean Shoot;


    private Stado stado = new Shooting(this);

    public int getBala() {
        return bala;
    }
    public boolean getShoot() {return Shoot;}

    public void subBala(int bala) {
        this.bala  += bala;
        this.bala = Math.max(this.bala, 0);
    }

    public void update() {
        stado.execute();
    }

    public void setStado(Stado stado) {
        this.stado.leave();
        this.stado = stado;
        stado.enter();
    }
    public void printStats(String stado) {
        System.out.println("\n---- Soldado ----");
        System.out.println(stado);
        System.out.println("muniçao " + getBala());
        System.out.println("atirando? " + getShoot());

    }

}
