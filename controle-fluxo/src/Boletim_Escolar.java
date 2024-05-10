public class Boletim_Escolar {
    public static void main(String[] args) {
        // Definindo a nota do aluno
        int nota = 5;

        // Usando o operador ternário para determinar o status do aluno
        // com base na nota
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        // Imprimindo o status do aluno
        System.out.println(resultado);
    }
}
