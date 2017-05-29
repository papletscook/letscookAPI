/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.dao.FactoryDAO;
import br.edu.up.dao.InterfaceDAO;
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
    
    private InterfaceDAO<IngredienteGeladeira> dao = FactoryDAO.createInterfaceDAOIngredienteDAO();
    
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
    public void cadastrarIngredienteGeladeira() {
        try {
            Usuario u = new Usuario();
            u.setId(1l);
            Geladeira g = serv.buscarPorUsuario(u);
            
            Integer qtde = g.getIngs().size();

            IngredienteGeladeira i = new IngredienteGeladeira();
            i.setGeladeira(g);
            i.setNome("Feijão");
            dao.cadastrar(i);
            
            g.adicionarIngredientes(i);
            
            assertTrue(qtde+1 == g.getIngs().size());
            assertTrue(i.getId() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void geladeira() {
        try {
            Usuario u = new Usuario();
            u.setId(1l);
            assertTrue(!serv.buscarPorUsuario(u).getIngs().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
