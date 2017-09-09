/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.InterfaceDAO;
import br.edu.up.letscook.model.entity.DespensaUsuario;
import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.IngredienteDispensa;
import br.edu.up.letscook.model.entity.Usuario;
import br.edu.up.letscook.model.service.FactoryService;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.edu.up.letscook.model.service.InterfaceDispensaService;

/**
 *
 * @author G0042204
 */
public class ManipularDispensaJUnitTest {

    private final InterfaceDispensaService<DespensaUsuario> serv = FactoryService.createInterfaceGeladeiraService();

    private final InterfaceDAO<Ingrediente> dao = FactoryDAO.createInterfaceIngredienteDAO();

    public ManipularDispensaJUnitTest() {
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
            DespensaUsuario g = serv.buscarPorUsuario(u);

            Ingrediente i = new Ingrediente();
            i.setNome("Feijão");

            IngredienteDispensa id = new IngredienteDispensa();
            id.setI(i);

            g.adicionarIngredientes(id);

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
            DespensaUsuario g = serv.buscarPorUsuario(u);

            if (g == null) {

                g = new DespensaUsuario();
                
                g.setDono(u);

                serv.cadastrar(g);
            }

            assertTrue(g.getId() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }
}
