public class Churrasco {
    double qtdCarne;

    public void verificarConsumo(Pessoas pessoa) {
        if (pessoa.idade >= 4 && pessoa.idade <= 12 && !pessoa.vegetariana) {
            qtdCarne = 1.0; // 1 kilo de carne
        } else if (pessoa.idade >= 13 && !pessoa.vegetariana) {
            qtdCarne = 2.0; // 2 kilos de carne
        } else {
            qtdCarne = 0.0; // Nenhuma carne
        }
    }
}