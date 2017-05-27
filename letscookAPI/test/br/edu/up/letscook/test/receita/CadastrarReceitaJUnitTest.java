/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.dao.FactoryDAO;
import br.edu.up.dao.InterfaceDAO;
import br.edu.up.entity.NascionalidadeEnum;
import br.edu.up.entity.Receita;
import br.edu.up.entity.Usuario;
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
public class CadastrarReceitaJUnitTest {

    private InterfaceDAO<Receita> dao = FactoryDAO.createReceitaDAO();

    private InterfaceDAO<Usuario> uDao = FactoryDAO.createUsuarioDAO();

    public CadastrarReceitaJUnitTest() {
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

            Usuario u = new Usuario();
            u.setEmail("henmerlin@gmail.com");
            uDao.cadastrar(u);

            assertTrue(u.getId() != null);

            Receita r = new Receita();
            r.setNome("Nome da Receita");
            r.setCriador(null);
            r.setFoto("foto");
            r.setNasc(NascionalidadeEnum.AFGHAN);
            r.setCriador(u);

            dao.cadastrar(r);

            assertTrue(r.getId() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }
}
