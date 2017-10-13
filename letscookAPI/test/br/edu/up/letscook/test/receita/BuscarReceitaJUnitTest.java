/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.enums.NacionalidadeEnum;
import br.edu.up.letscook.model.service.FactoryService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.edu.up.letscook.model.service.ReceitaService;

/**
 *
 * @author G0042204
 */
public class BuscarReceitaJUnitTest {

    private ReceitaService serv = FactoryService.createReceitaService();

    public BuscarReceitaJUnitTest() {
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
    public void buscarPorId() throws Exception {
        Receita g = new Receita();
        g.setId(4l);
        Assert.assertNotNull(serv.buscarPorId(g));
    }

    @Test
    public void buscarPorNome() {
        assertTrue(!serv.buscarPorNome("TORTA").isEmpty());
    }

    @Test
    public void buscarPorIngredientes() {
        CategoriaReceita cat = new CategoriaReceita();
        cat.setId(1l);
        assertTrue(!serv.buscarPorCategoria(cat).isEmpty());
    }

    @Test
    public void buscarPorNacionalidade() {
        assertTrue(!serv.buscarPorNacionalidade(NacionalidadeEnum.BRASIL).isEmpty());
    }

}
