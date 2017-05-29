/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.model.Tomate;
import br.edu.up.model.entity.Geladeira;
import br.edu.up.model.entity.IngredienteGeladeira;
import br.edu.up.model.entity.Usuario;
import br.edu.up.model.service.FactoryService;
import br.edu.up.model.service.InterfaceGeladeiraService;
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
public class ManipularGeladeiraJUnitTest {

    private InterfaceGeladeiraService<Geladeira> serv = FactoryService.createInterfaceGeladeiraService();

    public ManipularGeladeiraJUnitTest() {
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
    public void cadastrarIngrediente() {

        try {
            Geladeira g = new Geladeira();
            Usuario u = new Usuario();
            u.setId(1l);
            g.setDono(u);
            
            
            IngredienteGeladeira i = new Tomate();
            i.setGeladeira(g);
            
            g.adicionarIngredientes(i);
            
            u.setGeladeira(g);
            
            
            serv.cadastrar(g);
            assertTrue(g.getId() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }
}
