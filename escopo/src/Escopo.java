public class Escopo {
    public static void main(String[] args) {
        Conta conta = new Conta();

        // Chamada do método sacar
        Double valorSaque = 5.0;
        conta.sacar(valorSaque);

        // Chamada do método imprimirSaldo
        conta.imprimirSaldo();

        // Chamada do método calcularDividaExponencial
        double dividaExponencial = conta.calcularDividaExponencial();
        System.out.println("Dívida Exponencial: " + dividaExponencial);
    }
}
