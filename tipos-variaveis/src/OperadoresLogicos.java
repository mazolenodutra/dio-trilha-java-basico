public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicional1 = true;

        boolean condicional2 = false;

        if (condicional1 && condicional2) {
            System.out.println("As condições são verdadeiras");
        }

        if (condicional1 || condicional2) {
            System.out.println("Uma das condições é verdadeira");
        }

        condicional1 = true;

        condicional2 = true;

        if (condicional1 && condicional2) {
            System.out.println("As condições são verdadeiras");
        }

        System.out.println("Fim");
    }
}
