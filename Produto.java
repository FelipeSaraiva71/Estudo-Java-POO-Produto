import java.text.NumberFormat;
import java.util.Locale;

public class Produto {
//ENCAPSULANDO ATRIBUTOS

    private String nome;
    private double valor;

    //CONSTRUTOR DEFINIÇÃO CARACTERISTICA OBJETO

    public Produto (String nome, double valor) {

        this.nome = Util.validaNome(nome);
        this.valor = Util.validaValor(valor);
    }

        //ACESSANDO

    String getNome(){
        return nome;
    }
    double getValor(){
        return valor;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return nome + " - " + nf.format(valor);


    }

    public String faixaValor (){

        if (valor <=20) return "barato";
            else if (valor <=50) return "caro";
            else return  "muito caro";
            }
        }
