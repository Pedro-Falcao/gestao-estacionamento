public class Vaga {

    private int andar;
    private boolean status;
    private boolean preferencial;

    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isPreferencial() {
        return preferencial;
    }
    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }
    public Vaga(int andar, boolean status, boolean preferencial) {
        this.andar = andar;
        this.status = status;
        this.preferencial = preferencial;
    }
}
