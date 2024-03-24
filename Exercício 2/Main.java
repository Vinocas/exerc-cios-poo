public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        System.out.println("Estado inicial da lâmpada: " + lampada.checaEstado());

        lampada.click();
        System.out.println("Estado após o primeiro click: " + lampada.checaEstado());
        System.out.println("Quantidade de acendimentos: " + lampada.qtdAcendimentos());

        lampada.click();
        System.out.println("Estado após o segundo click: " + lampada.checaEstado());
        System.out.println("Quantidade de acendimentos: " + lampada.qtdAcendimentos());
    }
}