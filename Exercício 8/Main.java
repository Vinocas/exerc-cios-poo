public class Main {
    public static void main(String[] args) {
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();

        System.out.println("Número total de aberturas: " + Porta.getNumAberturas());

        porta1.abrir();
        porta2.abrir();
        porta2.fechar();

        System.out.println("Porta 1 está aberta? " + porta1.isOpen());
        System.out.println("Porta 2 está aberta? " + porta2.isOpen());
        System.out.println("Número total de aberturas: " + Porta.getNumAberturas());
    }
}