/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.dao;

import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.service.FactoryService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.up.letscook.model.service.ReceitaService;

/**
 *
 * @author g0042204
 */
public class ConexaoDAOJUnitTest {

    private ReceitaService serv = FactoryService.createReceitaService();

    public ConexaoDAOJUnitTest() {
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
    public void hello() throws Exception{
        
        Receita r = new Receita();
        r.setId(1l);
        assertNotNull("DAO", serv.buscarPorId(r));
    }
}
