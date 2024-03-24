public class Cliente {
    private String nome;
    private String cpf;
    private Telefone telefone;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: (" + telefone.obterDDD() + ") " + telefone.obterNumero());
    }
}