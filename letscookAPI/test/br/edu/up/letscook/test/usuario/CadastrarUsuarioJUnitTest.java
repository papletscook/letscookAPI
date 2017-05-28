/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.usuario;

import br.edu.up.dao.FactoryDAO;
import br.edu.up.model.entity.Usuario;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.edu.up.dao.InterfaceDAO;
import br.edu.up.model.util.UsuarioDecorator;

/**
 *
 * @author G0042204
 */
public class CadastrarUsuarioJUnitTest {

    private InterfaceDAO<Usuario> dao = FactoryDAO.createUsuarioDAO();

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
        
        dao.cadastrar(u);
        
        Assert.assertEquals(true, u.getId() != null);

    }
}
