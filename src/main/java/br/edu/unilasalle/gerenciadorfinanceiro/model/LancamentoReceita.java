package br.edu.unilasalle.gerenciadorfinanceiro.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by blouz on 05/04/2017.
 */
@Entity
@Table(name="LANCAMENTOS_RECEITA")
@DiscriminatorValue("2")
public class LancamentoReceita extends Lancamento {
}
