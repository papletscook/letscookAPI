/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.dao.FactoryDAO;
import br.edu.up.dao.InterfaceDAO;
import br.edu.up.model.entity.CategoriaReceita;
import br.edu.up.model.entity.IngredienteReceita;
import br.edu.up.model.enums.NacionalidadeEnum;
import br.edu.up.model.entity.Receita;
import br.edu.up.model.entity.Usuario;
import br.edu.up.model.service.FactoryService;
import br.edu.up.model.service.InterfaceService;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class CadastrarCategoriaJUnitTest {

    private InterfaceService<CategoriaReceita> serv = FactoryService.createCategoriaReceitaService();

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

        } catch (Exception e) {
            fail();
        }
    }
}
