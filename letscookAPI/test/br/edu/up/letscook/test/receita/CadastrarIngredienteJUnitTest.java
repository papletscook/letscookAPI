/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.service.FactoryService;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.edu.up.letscook.model.service.GenericService;

/**
 *
 * @author G0042204
 */
public class CadastrarIngredienteJUnitTest {

    private GenericService<Ingrediente> serv = FactoryService.createInterfaceIngredienteService();

    public CadastrarIngredienteJUnitTest() {
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
            Ingrediente i = new Ingrediente();
            i.setNome("Maracujá");
            
            serv.cadastrar(i);
            
            assertTrue(i.getId() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
