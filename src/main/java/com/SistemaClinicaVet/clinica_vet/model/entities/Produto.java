package com.SistemaClinicaVet.clinica_vet.model.entities;

import java.util.ArrayList;

public abstract class Produto {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
