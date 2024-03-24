public class Lampada {
    private EstadoLampada estado;
    private int qtdAcendimentos;

    public Lampada() {
        this.estado = EstadoLampada.APAGADA;
        this.qtdAcendimentos = 0;
    }

    public void click() {
        if (estado == EstadoLampada.APAGADA) {
            estado = EstadoLampada.ACESA;
            qtdAcendimentos++;
        } else {
            estado = EstadoLampada.APAGADA;
        }
    }

    public int qtdAcendimentos() {
        return qtdAcendimentos;
    }

    public EstadoLampada checaEstado() {
        return estado;
    }
}