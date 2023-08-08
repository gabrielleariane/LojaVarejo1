package br.com.gabi.LojaVarejo1.model;

import br.com.gabi.LojaVarejo1.domain.Produto;

import java.util.List;

public class ProdutoModel {
    private int id;
    private String nome;
    private double preco;

    public ProdutoModel(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public static void addAtribute(String produtos, List<Produto> produtos1) {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
