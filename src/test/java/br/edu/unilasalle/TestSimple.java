package br.edu.unilasalle;


import br.edu.unilasalle.gerenciadorfinanceiro.dao.CategoriaDAO;
import br.edu.unilasalle.gerenciadorfinanceiro.model.Banco;
import br.edu.unilasalle.gerenciadorfinanceiro.model.Categoria;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestSimple {

    @Test
    public void deveInserirUmaCategoria(){
        CategoriaDAO categoriaDao = new CategoriaDAO();
        Categoria categoria = new Categoria();
        categoria.setNome("Teste");
        categoriaDao.insert(categoria);
        assertEquals(categoriaDao.selectAll().size(),1);
    }
}
