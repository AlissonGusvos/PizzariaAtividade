package com.pizzariaAtividade.Curso.Spring.pizza;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaDTO {
    private String nome;
    private double preco;
    private boolean disponivel;
    private Sabor sabor;
    private Tamanho tamanho;
}
