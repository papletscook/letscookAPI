/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.usuario;

import br.edu.up.letscook.model.entity.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.edu.up.letscook.model.service.FactoryService;
import br.edu.up.letscook.model.util.UsuarioDecorator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import br.edu.up.letscook.model.service.UsuarioService;

/**
 *
 * @author G0042204
 */
public class CadastrarUsuarioJUnitTest {

    private UsuarioService serv = FactoryService.createInterfaceUsuarioService();

    public CadastrarUsuarioJUnitTest() {
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
    public void test() {

        Usuario u = UsuarioDecorator.criar();

        try {
            serv.cadastrar(u);
            assertEquals(true, u.getId() != null);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

    }
}
