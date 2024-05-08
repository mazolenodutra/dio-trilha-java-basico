public class Conta {
    // Variável da classe Conta
    private double saldo = 10.0;

    public void sacar(Double valor) {
        // Variável local de método
        double novoSaldo = saldo - valor;
        saldo = novoSaldo;
    }

    public void imprimirSaldo() {
        // Disponível em toda a classe
        System.out.println("Saldo: " + saldo);
    }

    public double calcularDividaExponencial() {
        // Variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // Começando a variável com valor zero

        for (int x = 1; x <= 5; x++) { // x variável de escopo de fluxo
            // Esta variável será reiniciada a cada execução do for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        // Escopo de fluxo
        // x e valorCalculado nunca estarão disponíveis fora do for

        return valorMontante;
    }
}
