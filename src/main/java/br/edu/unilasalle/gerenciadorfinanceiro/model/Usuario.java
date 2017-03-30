package br.edu.unilasalle.gerenciadorfinanceiro.model;

import javax.persistence.*;

/**
 * Created by 201320336 on 23/03/2017.
 */
@Entity
@Table(name = "USUARIOS")
@SequenceGenerator(name = "USUARIOS_SEQUENCE", sequenceName = "USUARIOS_SEQ", initialValue = 1, allocationSize = 1)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIOS_SEQUENCE")
    @Column(name = "ID")
    private Long Id;

    @Column(name = "NOME_COMPLETO", length=100, nullable = false)
    private String nomeCompleto;

    @Column(name = "NOME_USUARIO", length=100, nullable = false)
    private String nomeUsuario;

    @Column(name = "SENHA", length=100, nullable = false)
    private String senha;
}
