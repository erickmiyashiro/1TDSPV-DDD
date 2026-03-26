package br.com.fiap.loja.model;

public class Produto {

    //public - modificador de acesso que permite que todos tenham acesso
    public double preco;
    public int quantidade;
    public String nome;
    public boolean garantia;

    public Categoria categoria;

    public double calcularDesconto() {
        //calcular o valor do produto com 10% de desconto
        double precoComDesconto = preco - preco * 0.10;
        return precoComDesconto;
        //return preco - preco * 0.10;
    }

    public void alterarPreco(double novoPreco) {
        preco = novoPreco;
    }

    public double calcularDescontoPorQuantidade(int qtd) {
        double valorFinal;
        if (qtd >= 5 && qtd < 10) {
            valorFinal = preco * 0.85;
        } else if (qtd >= 10 && qtd < 15) {
            valorFinal = preco * 0.8;
        } else {
            valorFinal = preco * 0.9;
        }
        return valorFinal;


        }

    }
}