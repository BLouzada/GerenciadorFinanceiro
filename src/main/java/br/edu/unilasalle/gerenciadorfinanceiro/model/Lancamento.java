package br.edu.unilasalle.gerenciadorfinanceiro.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import br.edu.unilasalle.gerenciadorfinanceiro.model.Conta;

@Entity
@Table(name="LANCAMENTOS")
@SequenceGenerator(name= "LANCAMENTOS_SEQUENCE", sequenceName = "LANCAMENTOS_SEQ", initialValue=1, allocationSize = 1)
public class Lancamento {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LANCAMENTOS_SEQUENCE")
    @Column(name="ID")
    private Long id;

    @Column(name = "DESCRICAO", length=100, nullable = true)
    private String descricao;

    @Column(name = "DATA_CRIACAO", nullable = false)
    private Date dataCriacao;

    @Column(name = "VALOR_LANCAMENTO", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorLancamento;

    @Column(name = "FIXO", nullable = false)
    private boolean fixo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CONTA_ID", foreignKey = @ForeignKey(name = "LANCAMENTO_CONTA_FK"))
    private Conta conta;

}
