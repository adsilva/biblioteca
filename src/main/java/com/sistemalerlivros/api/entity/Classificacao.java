package com.sistemalerlivros.api.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Classificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Long idClassificacao;
    private StatusLivro statusLivro;
    @ManyToOne
    @JoinColumn(name = "idLivro", nullable = false)
    private Livro livro;
    private Usuario usuario;

}
