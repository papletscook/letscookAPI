/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.InterfaceDAO;
import br.edu.up.letscook.model.Tomate;
import br.edu.up.letscook.model.entity.Geladeira;
import br.edu.up.letscook.model.entity.IngredienteGeladeira;
import br.edu.up.letscook.model.entity.Usuario;
import br.edu.up.letscook.model.service.FactoryService;
import br.edu.up.letscook.model.service.InterfaceGeladeiraService;
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

            
            IngredienteGeladeira i = new IngredienteGeladeira();
            i.setNome("Feijão");
            
            g.adicionarIngredientes(i);


            assertTrue(g.getId() != null);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void geladeira() {
        try {
            Usuario u = new Usuario();
            u.setId(1l);
            assertTrue(serv.buscarPorUsuario(u) != null);
        } catch (Exception e) {
            fail();
        }
    }
    
   @Test
    public void cadastrarGeladeira() {
        try {
            Usuario u = new Usuario();
            u.setId(1l);
            Geladeira g = serv.buscarPorUsuario(u);

            if(g == null){
                serv.cadastrar(g);
            }
            
            assertTrue(g.getId() != null);
        } catch (Exception e) {
            fail();
        }
    }}
