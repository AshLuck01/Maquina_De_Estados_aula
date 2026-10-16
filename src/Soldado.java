public class Soldado implements Papeis  {
    private int bala = 50;
    public   boolean Shoot;


    private Estado estado = new Shooting(this);

    public int getBala() {
        return bala;
    }
    public boolean getShoot() {return Shoot;}

    public void subBala(int bala) {
        this.bala  += bala;
        this.bala = Math.max(this.bala, 0);
    }

    public void update() {
        estado.execute();
    }

    public void setStado(Estado estado) {
        this.estado.leave();
        this.estado = estado;
        estado.enter();
    }
    public void printStats(String stado) {
        System.out.println("\n---- Soldado ----");
        System.out.println(estado);
        System.out.println("munição " + getBala());
        System.out.println("atirando? " + getShoot());

    }

}
