/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.domain;

import br.edu.up.letscook.model.entity.Ingrediente;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class BuscaInteligenteIT {

    public BuscaInteligenteIT() {
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

    /**
     * Test of buscarPorIngredientes method, of class BuscaInteligente.
     */
    @Test
    public void testBuscarPorIngredientes() {
        System.out.println("buscarPorIngredientes");
        try {
            List<Ingrediente> ir = new ArrayList<>();

            Ingrediente ing = new Ingrediente();
            ing.setId(2l);

            Ingrediente ing1 = new Ingrediente();
            ing.setId(1l);

            ir.add(ing1);
            ir.add(ing);

            BuscaInteligente instance = new BuscaInteligenteImpl();
            List<ScoreReceita> result = instance.buscarPorIngredientes(ir);
            System.out.println("end");

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
