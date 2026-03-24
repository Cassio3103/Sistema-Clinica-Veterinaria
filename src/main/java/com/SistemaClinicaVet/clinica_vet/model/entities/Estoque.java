package com.SistemaClinicaVet.clinica_vet.model.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Entity
public class Estoque {

    private int quantidadeEstoque;
    private double precoProduto;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Estoque(int quantidadeEstoque, double precoProduto){
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoProduto = precoProduto;
    }


    public void listarProdutosNoEstoque(){
        for(Produto produto : produtos){
            System.out.println(produtos);
        }
    }

}
