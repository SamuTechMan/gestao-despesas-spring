package br.com.projetinspring.gestao_despesas.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "despesa")
@Data
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String categoria;

    @CreationTimestamp
    private LocalDate data_criacao;

}
