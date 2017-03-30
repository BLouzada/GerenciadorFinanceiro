package br.edu.unilasalle.gerenciadorfinanceiro.model;

import javax.persistence.*;

/**
 * Created by 201320336 on 23/03/2017.
 */
@Entity
@Table(name="CONTAS")
@SequenceGenerator(name= "CONTAS_SEQUENCE", sequenceName = "CONTAS_SEQ", initialValue=1, allocationSize = 1)
public class Conta {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONTAS_SEQUENCE")
    @Column(name="ID")
    private Long id;

    @Column(name="NUMERO")
    private int numero;

    @ManyToOne(optional=false)
    @JoinColumn(name="BANCO_ID", foreignKey=@ForeignKey(name="CONTA_BANCO_FK"))
    private Banco banco;

    @ManyToOne(optional=false)
    @JoinColumn(name="USUARIO_ID", foreignKey= @ForeignKey(name="CONTA_USUARIO_FK"))
    private Usuario usuario;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
