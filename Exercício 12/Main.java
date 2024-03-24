public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "123.456.789-00");
        Telefone telefone = new Telefone("11", "98765-4321");
        
        cliente.adicionarTelefone(telefone);
        cliente.mostrarDados();
    }
}