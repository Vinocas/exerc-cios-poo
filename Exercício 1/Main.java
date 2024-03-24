public class Main {
    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas("João", "Masculino", 10, false);
        Pessoas pessoa2 = new Pessoas("Maria", "Feminino", 25, true);
        
        Churrasco churrasco = new Churrasco();

        churrasco.verificarConsumo(pessoa1);
        System.out.println("Quantidade de carne para " + pessoa1.nome + ": " + churrasco.qtdCarne + " kg");

        churrasco.verificarConsumo(pessoa2);
        System.out.println("Quantidade de carne para " + pessoa2.nome + ": " + churrasco.qtdCarne + " kg");
    }
}