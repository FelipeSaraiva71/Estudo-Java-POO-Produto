import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        System.out.println("Quantos produtos: ");
        int quantidade = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < quantidade; i++) {

           String nome ="";
           double valor = 0;


            while (true){
                try {
                    System.out.println("Produto " + (1 + i) + ": ");
                    nome = scanner.nextLine();
                    Util.validaNome(nome);

                    System.out.println("Valor: ");
                    valor = Double.parseDouble(scanner.nextLine());
                    Util.validaValor(valor);
                    break;
                }catch (IllegalArgumentException e){
                    System.out.println("Entrada invalida! Tente novamente.");
                }

            }
            Produto produto = new Produto(nome, valor);
            produtos.add(produto);
        }
scanner.close();

        for (Produto p:produtos){
            System.out.println("produtos: "+p+", "+p.faixaValor());

        }
    }
}
