public class Util {

    public static String validaNome(String nome) {
        if (nome == null || !nome.matches("[\\p{L} ]+")) {
            throw new IllegalArgumentException("Nome inválido! Use apenas letras e espaços.");
        }
        return nome.trim();
    }

    public static double validaValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        return valor;
    }
}