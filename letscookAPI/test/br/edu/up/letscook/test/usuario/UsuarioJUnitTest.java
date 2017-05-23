/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.usuario;

import br.edu.up.dao.UsuarioDAO;
import br.edu.up.entity.Usuario;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.edu.up.dao.InterfaceDAO;

/**
 *
 * @author G0042204
 */
public class UsuarioJUnitTest {

    private InterfaceDAO<Usuario> dao = new UsuarioDAO();

    public UsuarioJUnitTest() {
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

        Usuario u = new Usuario();

        u.setEmail("email@gmail.com");
        u.setSenha("lihslkjfsa");
        u.setDataNasc(Calendar.getInstance().getTime());
        u.setTelefone("2187364873264");

        try {
            Assert.assertEquals(true, dao.cadastrar(u).getId() != null);
        } catch (Exception e) {
            Assert.fail();
        }

    }
}
