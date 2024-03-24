public class Porta {
    private boolean isOpen;
    private static int numAberturas;

    public Porta() {
        this.isOpen = false;
    }

    public void abrir() {
        isOpen = true;
        numAberturas++;
    }

    public void fechar() {
        isOpen = false;
    }

    public static int getNumAberturas() {
        return numAberturas;
    }

    public boolean isOpen() {
        return isOpen;
    }
}