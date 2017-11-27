/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Receita;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class ReceitaDAOIT {

    public ReceitaDAOIT() {
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

    /**
     * Test of buscarPorNome method, of class ReceitaDAO.
     */
    @Test
    public void testBuscarPorNome() {
        try {
            System.out.println("buscarPorNome");
            String nome = "caj";
            ReceitaDAO instance = new ReceitaDAOImpl();
            List<Receita> result = instance.buscarPorNome(nome);
            System.out.println("");
            assertTrue(!result.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());

        }

    }

    /**
     * Test of buscarPorCategoria method, of class ReceitaDAO.
     */
    @Test
    public void testBuscarPorCategoria() {
        System.out.println("buscarPorCategoria");
        CategoriaReceita categoria = null;
        ReceitaDAO instance = new ReceitaDAOImpl();
        List<Receita> expResult = null;
        List<Receita> result = instance.buscarPorCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarBemAvaliadas method, of class ReceitaDAO.
     */
    @Test
    public void testBuscarBemAvaliadas() {
        System.out.println("buscarBemAvaliadas");
        ReceitaDAO instance = new ReceitaDAOImpl();
        List<Receita> expResult = null;
        List<Receita> result = instance.buscarBemAvaliadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
