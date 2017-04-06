package br.edu.unilasalle.gerenciadorfinanceiro.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.edu.unilasalle.gerenciadorfinanceiro.model.Conta;

@Entity
@Table(name="LANCAMENTOS")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "LANC_TYPE",discriminatorType = DiscriminatorType.INTEGER)
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

    @ManyToOne(optional = true)
    @JoinColumn(name = "USUARIO_ID", foreignKey = @ForeignKey(name = "LANCAMENTO_USUARIO_FK"))
    private Usuario usuario;

    @OneToMany()
    @JoinColumn(name = "ITEM_LANCAMENTO_ID", foreignKey = @ForeignKey(name = "LANCAMENTO_ITEM_LNC_FK"))
    private List<ItemLancamento> itensLancamento;

    @ManyToOne(optional = true)
    @JoinColumn(name = "CATEGORIA_ID", foreignKey = @ForeignKey(name = "LANCAMENTO_CATEGORIA_FK"))
    private Categoria categoria;

}
