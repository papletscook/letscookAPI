/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.IngredienteReceita;
import br.edu.up.letscook.model.enums.NacionalidadeEnum;
import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.entity.Usuario;
import br.edu.up.letscook.model.service.FactoryService;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.edu.up.letscook.dao.GenericDAO;
import br.edu.up.letscook.model.service.GenericService;

/**
 *
 * @author G0042204
 */
public class CadastrarCategoriaJUnitTest {

    private GenericService<CategoriaReceita> serv = FactoryService.createCategoriaReceitaService();

    public CadastrarCategoriaJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void cadastrar() {

        try {

            CategoriaReceita cat = new CategoriaReceita();
            cat.setNome("Doces e Sobremesas");

            CategoriaReceita cat1 = new CategoriaReceita();
            cat1.setNome("Massas");

            serv.cadastrar(cat);
            serv.cadastrar(cat1);

            assertTrue(cat.getId() != null);
            assertTrue(cat1.getId() != null);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
