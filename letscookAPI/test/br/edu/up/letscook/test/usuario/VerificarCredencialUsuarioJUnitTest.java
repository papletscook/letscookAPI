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
import br.edu.up.letscook.model.service.InterfaceUsuarioService;
import br.edu.up.letscook.model.util.Md5Util;
import br.edu.up.letscook.model.util.UsuarioDecorator;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 *
 * @author G0042204
 */
public class VerificarCredencialUsuarioJUnitTest {

    private InterfaceUsuarioService serv = FactoryService.createInterfaceUsuarioService();

    public VerificarCredencialUsuarioJUnitTest() {
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
    public void loginOk() {
        Usuario u = UsuarioDecorator.criar();
        u.setId(1l);
        try {
            // Simula MD5 Cliente
            u.setSenha(Md5Util.hash(u.getSenha()));
            assertTrue(serv.verificarCredencial(u));
        } catch (Exception ex) {
            ex.printStackTrace();
            fail(ex.getMessage());
        }
    }

    @Test
    public void senhaIncorreta() {
        Usuario u = UsuarioDecorator.criar();
        u.setId(1l);
        u.setSenha("ASJsanjifn");

        try {
            assertFalse(serv.verificarCredencial(u));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
}
