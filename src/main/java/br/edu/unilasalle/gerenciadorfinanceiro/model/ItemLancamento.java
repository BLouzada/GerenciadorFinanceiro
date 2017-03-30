package br.edu.unilasalle.gerenciadorfinanceiro.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 201320336 on 23/03/2017.
 */
@Entity
@Table(name = "ITEM_LANCAMENTO")
@SequenceGenerator(name = "ITEM_LANCAMENTO_SEQUENCE", sequenceName = "ITEM_LANCAMENTO_SEQ", initialValue = 1, allocationSize = 1)
public class ItemLancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_LANCAMENTO_SEQUENCE")
    @Column(name = "ID")
    private Long Id;

    @Column(name = "DATA", nullable = false)
    private Date data;

    @Column(name = "VALOR", nullable = false)
    private BigDecimal valor;

}
