package com.pizzariaAtividade.Curso.Spring.pizza;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pizza")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double preco;
    private boolean disponivel;
    @Enumerated(EnumType.STRING)
    private Sabor sabor;
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
}
