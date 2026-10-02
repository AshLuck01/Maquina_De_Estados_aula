public class Soldado {
    private int bala = 50;
    public boolean Shoot;


    private Stado stado = new Shooting(this, null);

    public int getBala() {
        return bala;
    }
    public boolean getShoot() {return Shoot;}

    public void subBala(int bala) {
        this.bala  += bala;
        this.bala = Math.max(this.bala, 0);
    }
    public void addBala(int bala) {
        this.bala  += bala;
        this.bala = Math.min(this.bala, 50);
    }
    public void update() {
        stado.execute();
    }

    public void setStado(Stado stado) {
        this.stado.leave();
        this.stado = stado;
        stado.enter();
    }


}
