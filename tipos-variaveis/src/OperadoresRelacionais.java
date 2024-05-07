public class OperadoresRelacionais {
    public static void main(String[] args) {

        String nomeUm = "Dutra";
        String nomeDois = new String("Dutra");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira! ");
        }

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual ao numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    }
}
