/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.service.FactoryService;
import br.edu.up.letscook.model.service.InterfaceService;
import br.edu.up.letscook.model.util.ReceitaDecorator;
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
public class CadastrarReceitaDecoratorJUnitTest {
    
    private InterfaceService<Receita> serv = FactoryService.createReceitaService();
    
    public CadastrarReceitaDecoratorJUnitTest() {
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
            Receita r = ReceitaDecorator.criarBolo();
            serv.cadastrar(r);
            assertTrue(r.getId() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
    
    @Test
    public void cadastrarSemIngrediente() {
        try {
            Receita r = ReceitaDecorator.criarBolo();
            r.setIngts(null);
            serv.cadastrar(r);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
